<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--begin of menu-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href='<c:url value='/trang-chu'/>' >Home</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
            <ul class="navbar-nav m-auto">
                
                <c:if test="${mySessionAttribute.admin }">
                <li class="nav-item">
                    <a class="nav-link" href='<c:url value='/manageProduct'/>'>Manager Product</a>
                </li>
                </c:if>
                <li class="nav-item">
                    <a class="nav-link" >Hello ${mySessionAttribute.name }</a>
                </li>
                <c:if test="${sessionScope.mySessionAttribute != null }">
                <li class="nav-item">
                    <a class="nav-link" href='<c:url value='/logout'/>'>Logout</a>
                </li>
                </c:if>
                <c:if test="${sessionScope.mySessionAttribute == null }">
                <li class="nav-item">
                    <a class="nav-link"  href='<c:url value='/login'/>'>Login</a>
                </li>               
                </c:if>
            </ul>

            <form action="trang-chu" method="post" class="form-inline my-2 my-lg-0">
                <div class="input-group input-group-sm">
                    <input name	="txtSearch" type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm" placeholder="Search...">
                    <div class="input-group-append">
                        <button type="submit" class="btn btn-secondary btn-number">
                            <i class="fa fa-search"></i>
                        </button>
                    </div>
                </div>
                <a class="btn btn-success btn-sm ml-3"  href='<c:url value='/cart'/>'>
                    <i  class="fa fa-shopping-cart"></i> Cart
                    <span class="badge badge-light">${ Cart.size() }</span>
                </a>
            </form>
        </div>
    </div>
</nav>
<section class="jumbotron text-center">
    <div class="container">
        <h1 class="jumbotron-heading">Quán chay của Quân Đen</h1>
        <p class="lead text-muted mb-0">thực phẩm chay phong phú Âu lạc và những món ăn tự làm có 1-0-2 của cửa hàng</p>
    </div>
</section>
<script >

      
      	
      	function searchByName(param){
            var txtSearch = param.value;
            $.ajax({
                url: "/spring-mvc/trang-chu",
                type: "post", //send it through get method
                data: {
                    txt: txtSearch
                },
                success: function (data) {
                    var row = document.getElementById("content");
                    row.innerHTML = data;
                },
                error: function (xhr) {
                    //Do Something to handle error
                }
            });
        }
      	
      
      	

</script>
<!--end of menu-->
