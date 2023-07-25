<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>���� ���� API</title>
	<style>
		/*
		flex : �� ��, �� �� �����Բ�.
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
		var mapContainer = document.getElementById('map'), // ������ ǥ���� div 
		    mapOption = {
		        center: new kakao.maps.LatLng(35.1466, 126.9223), // ������ �߽���ǥ
		        level: 9, // ������ Ȯ�� ����
		        mapTypeId : kakao.maps.MapTypeId.ROADMAP // ��������
		    }; 

		// ������ �����Ѵ� 
		var map = new kakao.maps.Map(mapContainer, mapOption); 
	/*
		���� ������ �����͸� ��û�ϴ� �Լ�
		1. ��������, �ּ�(���θ� or ����), ����, �浵, ������ȭ��ȣ �����͸� �����´�
		2. ������ �����͸� ��ü���·� �����Ѵ�.
			{tourNm:"", addr:"", lat:"", lng:"", tel:""}
		3. ��������ü�� positions �迭�� �����Ѵ�.
	*/
	let getTourDate = () => {
		let api_url = "http://apis.data.go.kr/6290000/tourdestbaseinfo/gettourdestbaseinfo?serviceKey=4GV1hSVU49RUlLplfS2Ib20hTR3oIb1HvjFal1RbA5Jc5cq1q43DB0Aq2gS7InxKpvHOqqJz0KRRHoZhrXjAqQ%3D%3D&type=json&tourDestNm=%EA%B3%B5%EC%9B%90&pageNo=1&numOfRows=20";
		$.ajax({
			url: api_url,
			success: function (res) {
				/*
					�ʿ��� �÷� :
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
					// ��Ŀ�� �����մϴ�
					var marker = new kakao.maps.Marker({
						map: map, // ��Ŀ�� ǥ���� ����
						position: positions[i].latlng // ��Ŀ�� ��ġ
					});

					// ��Ŀ�� ǥ���� ���������츦 �����մϴ� 
					var infowindow = new kakao.maps.InfoWindow({
						content: positions[i].content // ���������쿡 ǥ���� ����b nkj
					});

					// ��Ŀ�� mouseover �̺�Ʈ�� mouseout �̺�Ʈ�� ����մϴ�
					// �̺�Ʈ �����ʷδ� Ŭ������ ����� ����մϴ� 
					// for������ Ŭ������ ����� ���� ������ ������ ��Ŀ���� �̺�Ʈ�� ��ϵ˴ϴ�
					kakao.maps.event.addListener(marker, 'mouseover', makeOverListener(map, marker, infowindow));
					kakao.maps.event.addListener(marker, 'mouseout', makeOutListener(infowindow));
				}

				// ���������츦 ǥ���ϴ� Ŭ������ ����� �Լ��Դϴ� 
				function makeOverListener(map, marker, infowindow) {
					return function() {
						infowindow.open(map, marker);
					};
				}

				// ���������츦 �ݴ� Ŭ������ ����� �Լ��Դϴ� 
				function makeOutListener(infowindow) {
					return function() {
						infowindow.close();
					};
				}
			},
			error: function () {
                    alert("��û����..");
                }
		});
	}
	getTourDate();
	console.log(positions);
	</script>
</body>
</html>