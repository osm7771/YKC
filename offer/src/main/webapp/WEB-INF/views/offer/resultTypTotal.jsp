<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<head>

  <%@ include file="../include/header.jsp" %>

</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- Sidebar -->
    <%@ include file="../include/sidebar.jsp" %>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Topbar -->
        <%@ include file="../include/topbar.jsp" %>
        <!-- End of Topbar -->

        <!-- Begin Page Content -->
        <div class="container-fluid">

          <!-- Page Heading -->
          <h1 class="h3 mb-2 text-gray-800">헌금 조회</h1>
          <p class="mb-4">성도별 헌금을 조회 해 봅시다.<br/> 엑셀다운로드 준비중</p>

          <!-- DataTales Example -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">헌금 종류 : 
              <c:forEach var="cd" items="${offerVO.cdList}">
                    <th>${cd}</th>
              </c:forEach>  
              </h6>
            </div>
            <div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>헌금종류</th>
                      <c:forEach var="date" items="${offerVO.offerDateList}">
                      <td>${date}</td>
                      </c:forEach>     
                      <th>합계</th>                 
                    </tr>
                  </thead>
                  <tfoot>
                  </tfoot>
                  <tbody>
                  	<c:forEach var="offer" items="${OfferList}">
						<tr>
					      <th>${offer.get("OFFER_TYP_NAME")}</th>		
					      <c:forEach var="date" items="${offerVO.offerDateList}">
					      <td>${offer.get(date)}</td> 
					      </c:forEach>
					      <td>${offer.get("TOTAL")}</td>
					    </tr>
					</c:forEach>                    
                  </tbody>
                </table>
              </div>
            </div>
          </div>

        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->
      
      <%@ include file="../include/footer.jsp" %>

    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->
	<%@ include file="../include/footer2.jsp" %>
</body>

</html>