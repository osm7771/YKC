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
          <h1 class="h3 mb-2 text-gray-800">성도관리</h1>
          <p class="mb-4">성도를 검색 해 봅시다 <br/>성도 추가 기능 개발 필요</p>

          <!-- DataTales Example -->
          <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
            </div>
            <div class="card-body">
              <div class="table-responsive">
                <table width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>번호</th>
                      <th>이름</th>
                      <th>가정번호</th>
                      <th>대빵여부</th>
                      <th>교회번호</th>
                      
                    </tr>
                  </thead>
                  <tfoot>
                    <tr>
                      <th>번호</th>
                      <th>이름</th>
                      <th>가족번호</th>
                      <th>대빵여부</th>
                      <th>교회번호</th>
                      
                    </tr>
                  </tfoot>
                  <tbody>
                  	<c:forEach var="member" items="${mberList}">
						<tr>
					      <th>${member.member_no}</th>
					      <td>${member.name}</td>					     
					      <td>
					      <c:choose>
					      	<c:when test="${member.family_id eq null}">
					      		-
					      	</c:when>
					      	<c:otherwise>
					      		${member.family_id}
					      	</c:otherwise>
					      </c:choose>		
					      </td>					     
					      <td>
					      <c:choose>
					      	<c:when test="${member.type eq '1'}">
					      		대빵
					      	</c:when>
					      	<c:otherwise>
					      		
					      	</c:otherwise>
					      </c:choose>					      
					      </td>					     
					      <td>${member.ch_no}</td>					     
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
</body>

</html>