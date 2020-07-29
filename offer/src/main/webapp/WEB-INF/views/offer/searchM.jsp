<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%

String str1 = "";
int lentg1 = "추수감사헌금".length();
int lentg2 = "십일조".length();
lentg1 = (lentg1 * 15) + 60; 
lentg2 = (lentg2 * 15) + 60; 
%>
<head>

  <%@ include file="../include/header.jsp" %>

<script type="text/javascript">



</script>

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
            <form name="offerForm" id="offerForm" action="/offer/resultM" method="post">
          	<!-- Page Heading -->
          		<h1 class="h3 mb-4 text-gray-800">성도별 검색</h1>
          		
          		
          		<div class="col-lg-6">

	              <div class="card mb-4 py-3 border-left-primary">
	                <div class="card-body">
	                  	<p class="mb-4">기간설정</p>
						<select name="startY" class="custom-select custom-select-sm" style="width:100px;">
							<option value="2019">2019</option>
							<option value="2020">2020</option>
		
						</select>
						<select name="startM" class="custom-select custom-select-sm" style="width:100px;">
							<option value="01">01</option>
							<option value="02">02</option>
							<option value="03">03</option>
							<option value="04">04</option>
							<option value="05">05</option>
							<option value="06">06</option>
							<option value="07">07</option>
							<option value="08">08</option>
							<option value="09">09</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
						</select>
					 	~ 
						<select name="endY" class="custom-select custom-select-sm" style="width:100px;">
							<option value="2019">2019</option>
							<option value="2020">2020</option>
						</select>
						<select name="endM" class="custom-select custom-select-sm" style="width:100px;">
							<option value="01">01</option>
							<option value="02">02</option>
							<option value="03">03</option>
							<option value="04">04</option>
							<option value="05">05</option>
							<option value="06">06</option>
							<option value="07">07</option>
							<option value="08">08</option>
							<option value="09">09</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>					
						</select>
	                </div>
	              </div>
	
                <div class="card mb-4 py-3 border-left-secondary">
                    <div class="card-body">
                        <p class="mb-4">헌금선택</p>	                   
                        <c:set var="i" value="0"/>
                        <c:forEach var="OfferTyp" items="${OfferTypList}">
                            <c:set var="str_leng" value="${OfferTyp.offer_typ_name_length * 5 + 60}"/>
		                    <div class="toggle-button toggle-button--vesi">
				                <input id="toggleButton${i}" name="offer_typ_cd" type="checkbox" value="${OfferTyp.offer_typ_cd}"/>
				                <label for="toggleButton${i}" data-on-text="${OfferTyp.offer_typ_name}" data-off-text="${OfferTyp.offer_typ_name}" style="width:${str_leng}px;"></label>
				                <div class="toggle-button__icon"></div>
				                <c:set var="i" value="${i + 1}"/>
				            </div>
			            </c:forEach> 			            
	                </div>
	              </div>
	
	              <div class="card mb-4 py-3 border-left-success">
	                <div class="card-body">
	                   <a href="#submit" class="btn btn-success btn-icon-split">
	                    <span class="icon text-white-50">
	                      <i class="fas fa-check"></i>
	                    </span>
	                    <span class="text">Split Button Success</span>
	                  </a>
	                  <input type="submit" value="submit"/>
	                </div>
	              </div>
	
	              <div class="card mb-4 py-3 border-left-info">
	                <div class="card-body">
	                  .border-left-info
	                </div>
	              </div>
	
	              <div class="card mb-4 py-3 border-left-warning">
	                <div class="card-body">
	                  .border-left-warning
	                </div>
	              </div>
	
	              <div class="card mb-4 py-3 border-left-danger">
	                <div class="card-body">
	                  .border-left-danger
	                </div>
	              </div>
	
	              <div class="card mb-4 py-3 border-left-dark">
	                <div class="card-body">
	                  .border-left-dark
	                </div>
	              </div>
            	</div>
          	</form>  	         		
        	</div>      
        	 
		</div>
   	</div>
 </div>
      <!-- End of Main Content -->
	<%@ include file="../include/footer.jsp" %>
</body>

</html>