<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>다음 지도 API</title>
	<style>
		/*
		flex : 한 줄, 한 줄 나오게끔.
		*/
		.tour-infoWindow{
			display: flex; 
			flex-direction: column;
		}
	</style>
</head>
<body>
	<div id="map" style="width:750px;height:350px;"></div>

	<script src="./js/jquery-3.7.0.js"></script>

	<script src="//dapi.kakao.com/v2/maps/sdk.js?appkey=79769e254f2328cac41473351ff2b861"></script>
	<script>
		var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
		    mapOption = {
		        center: new kakao.maps.LatLng(35.1466, 126.9223), // 지도의 중심좌표
		        level: 9, // 지도의 확대 레벨
		        mapTypeId : kakao.maps.MapTypeId.ROADMAP // 지도종류
		    }; 

		// 지도를 생성한다 
		var map = new kakao.maps.Map(mapContainer, mapOption); 
	/*
		광주 관광지 데이터를 요청하는 함수
		1. 관광지명, 주소(도로명 or 지번), 위도, 경도, 관리전화번호 데이터를 가져온다
		2. 가져온 데이터를 객체형태로 저장한다.
			{tourNm:"", addr:"", lat:"", lng:"", tel:""}
		3. 관광지객체를 positions 배열에 저장한다.
	*/
	let getTourDate = () => {
		let api_url = "http://apis.data.go.kr/6290000/tourdestbaseinfo/gettourdestbaseinfo?serviceKey=4GV1hSVU49RUlLplfS2Ib20hTR3oIb1HvjFal1RbA5Jc5cq1q43DB0Aq2gS7InxKpvHOqqJz0KRRHoZhrXjAqQ%3D%3D&type=json&tourDestNm=%EA%B3%B5%EC%9B%90&pageNo=1&numOfRows=20";
		$.ajax({
			url: api_url,
			success: function (res) {
				/*
					필요한 컬럼 :
					1. tourDestNm
					2. addrRoad or addrJibun
					3. lat
					4. lng
					5. mngAgcTel
				*/
				var positions = []

				for (let i=0; i<res.TourDestBaseInfo.length; i++) {
					if (res.TourDestBaseInfo[i].addrRoad == null){
						let dic = {
							content: `
							<div class="tour-infoWindow">
								<span>${res.TourDestBaseInfo[i].tourDestNm}</span>
								<span>${res.TourDestBaseInfo[i].addrJibun}</span>
								<span>${res.TourDestBaseInfo[i].mngAgcTel}</span>
							</div>
							`,
							latlng: new kakao.maps.LatLng(res.TourDestBaseInfo[i].lat, res.TourDestBaseInfo[i].lng)
						}
						console.log(dic);
						positions.push(dic);
					} else {
						let dic = {
							content: `
							<div class="tour-infoWindow">
								<span>${res.TourDestBaseInfo[i].tourDestNm}</span>
								<span>${res.TourDestBaseInfo[i].addrRoad}</span>
								<span>${res.TourDestBaseInfo[i].mngAgcTel}</span>
							</div>
							`,
							latlng: new kakao.maps.LatLng(res.TourDestBaseInfo[i].lat, res.TourDestBaseInfo[i].lng)
						}
						console.log(dic);
						positions.push(dic);
					}
				}
				console.log(positions);

				for (var i = 0; i < positions.length; i ++) {
					// 마커를 생성합니다
					var marker = new kakao.maps.Marker({
						map: map, // 마커를 표시할 지도
						position: positions[i].latlng // 마커의 위치
					});

					// 마커에 표시할 인포윈도우를 생성합니다 
					var infowindow = new kakao.maps.InfoWindow({
						content: positions[i].content // 인포윈도우에 표시할 내용b nkj
					});

					// 마커에 mouseover 이벤트와 mouseout 이벤트를 등록합니다
					// 이벤트 리스너로는 클로저를 만들어 등록합니다 
					// for문에서 클로저를 만들어 주지 않으면 마지막 마커에만 이벤트가 등록됩니다
					kakao.maps.event.addListener(marker, 'mouseover', makeOverListener(map, marker, infowindow));
					kakao.maps.event.addListener(marker, 'mouseout', makeOutListener(infowindow));
				}

				// 인포윈도우를 표시하는 클로저를 만드는 함수입니다 
				function makeOverListener(map, marker, infowindow) {
					return function() {
						infowindow.open(map, marker);
					};
				}

				// 인포윈도우를 닫는 클로저를 만드는 함수입니다 
				function makeOutListener(infowindow) {
					return function() {
						infowindow.close();
					};
				}
			},
			error: function () {
                    alert("요청실패..");
                }
		});
	}
	getTourDate();
	console.log(positions);
	</script>
</body>
</html>