<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col">
				<nav aria-label="breadcrumb">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href='<c:url value='/trang-chu'/>' >Home</a></li>
						<li class="breadcrumb-item"><a href="#">Category</a></li>
						<li class="breadcrumb-item active" aria-current="#">Sub-category</li>
					</ol>
				</nav>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<jsp:include page="Left.jsp"></jsp:include>

			<div class="col-sm-9">
				<div id="content" class="row">
					<c:forEach items="${listProduct}" var="o">
						<div class="col-12 col-md-6 col-lg-4">
							<div class="card">
								<img class="card-img-top" src="${o.image}" height="256"
									width="240" alt="Card image cap">
								<div class="card-body">
									<h4 class="card-title show_txt">
										<a  href='<c:url value='/detail/${o.id}'/>' title="View Product">${o.name}</a>
									</h4>
									<p class="card-text show_txt">${o.description}</p>
									<div class="row">
										<div class="col">
											<p><fmt:formatNumber  type="number"  value="${o.price}" /></p>  
											 
										</div>
										<div class="col">
											<a href='<c:url value='/cart/AddCart/${o.id}'/>' class="btn btn-success btn-block">Add to cart</a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>

		</div>
	</div>



</body>
</html>

