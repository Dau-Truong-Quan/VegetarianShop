<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container-fluid body-detail">
	<div class="row">
		<div class="col-md-6 col-sm-12">
		<form action="Order" method="post">
		
		
		
			<div class="form-group">
			<h4>   	<label for="tenkhachhang">Họ và tên khách hàng</label></h4> <input type="text"
				value="${mySessionAttribute.name}"	class="form-control" id="tenkhachhang" placeholder="Họ tên của khách hàng" name="tenkhachhang">
			</div>
			
			<div class="form-group">
			
			<h4> <label for="sodt">Số điện thoại</label> </h4>
				<input
					type="text" class="form-control" id="sodt"
					placeholder="Số điện thoại" name="sodt">
			</div>
			
			<h4><label> Chọn hình thức giao hàng </label>  </h4>
			
			<div class="form-check">
				<input class="form-check-input" type="radio" name="hinhthucgiaohang"
					value="Giao hàng tận nơi miễn phí" id="giaohangtannoi"> <label
					class="form-check-label" for="giaohangtannoi"> Giao hàng
					tận nơi miễn phí </label>
			</div>

			<div class="form-check">
				<input class="form-check-input" type="radio" name="hinhthucgiaohang"
					value="Nhận tại cửa hàng" id="nhanhangcuahang"> <label
					class="form-check-label" for="nhanhangcuahang"> Nhận hàng
					tại shop </label>
			</div>
			
			<br/>
			
			<div class="form-group">
			
			<h4> <label for="diachigiaohang">Nhập vào địa chỉ giao hàng</label>  </h4>
				<input value="${ Order.address }"
					type="text" class="form-control" id="diachigiaohang" name="diachigiaohang"
					placeholder="Địa chỉ giao hàng">
			</div>

	
			<div class="form-group">
				<h4> <label for="ghichu">Ghi chú</label> </h4>
				<textarea class="form-control" id="ghichu" name="ghichu" placeholder="Ghi chú riêng cho shop"
					rows="5"></textarea>
			</div>
		<button type="submit" class="btn btn-success">Đặt hàng</button>
		
		</form>
		</div>

	</div>

</div>
</body>
</html>