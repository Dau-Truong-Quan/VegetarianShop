<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<div class="col-sm-3">
    <div class="card bg-light mb-3">
        <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> Categories</div>
        <ul class="list-group category_block">
            <c:forEach items="${listCategory}"  var="o">
                <li class="list-group-item text-white ${category_id == o.id ? "active":"" } "><a  href='<c:url value='/trang-chu/${o.id}'/>' >${o.name}</a></li>
               
            </c:forEach>

        </ul>
    </div>
    <div class="card bg-light mb-3">
        <div class="card-header bg-success text-white text-uppercase">Last product</div>
        <div class="card-body">
            <img class="img-fluid" src="${lastProduct.image }" height="256"
								width="240" />
            <h5 class="card-title">${lastProduct.name }</h5>
            <p class="card-text">${lastProduct.description }</p>
            <p class="bloc_left_price"><fmt:formatNumber  type="number"  value="${lastProduct.price}" /></p>  
        </div>
    </div>
</div>