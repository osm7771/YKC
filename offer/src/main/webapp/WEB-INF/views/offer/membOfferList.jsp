<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<head>

  <%@ include file="../include/header.jsp" %>
  
  <script>
	$(function() {
		$j171( "#datepicker1" ).datepicker({
	    dateFormat: 'yy.mm.dd',
	    prevText: '이전 달',
	    nextText: '다음 달',
	    monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
	    monthNamesShort: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
	    dayNames: ['일','월','화','수','목','금','토'],
	    dayNamesShort: ['일','월','화','수','목','금','토'],
	    dayNamesMin: ['일','월','화','수','목','금','토'],
	    showMonthAfterYear: true,
	    changeMonth: true,
	    changeYear: true,
	    yearSuffix: '년'
	  });
	});
	
	
	function goInsert(){
	     $("#offerInsertForm").submit();
	}

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

          <!-- Page Heading -->
          <h1 class="h3 mb-2 text-gray-800">헌금입력</h1>
          <p class="mb-4">----</p>

          <!-- DataTales Example -->
          <form name="offerInsertForm" id="offerInsertForm" action="/offer/offerInsert" method="post">
          
          <input type="hidden" id="member_no" name="member_no" value="${memberVO.member_no}" />
          <input type="hidden" id="name" name="name" value="${offerList.get(0).name}" />
          
          <div class="card shadow mb-4">
          
                <table class="formTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>이름</th>
                      <th>헌금일</th>
                      <th>헌금종류</th>
                      <th>헌금액</th>
                      <th style="width:100px;">비고</th>                      
                    </tr>
                  </thead>                  
                  <tbody>
                    
                        <tr>
                            <th>${offerList.get(0).name}</th>
                            <td><input type="text" id="datepicker1" name="offer_dtm" style="width:130px;"/></td>  
                            <td>
                            <select name="offer_typ_cd" class="custom-select custom-select-sm" style="width:180px;">
                            <c:forEach var="OfferTyp" items="${OfferTypList}">
	                            <option value="${OfferTyp.offer_typ_cd}">${OfferTyp.offer_typ_name}</option>
	                        </c:forEach>               
                            </select>
                            </td>                        
                            <td><input type="text" id="offer_val" name="offer_val"/></td>
                            <td>
                                <a href="javascript:goInsert('${offer.member_no}')" class="btn btn-secondary btn-icon-split">
                                    <span class="icon text-white-50"><i class="fas fa-arrow-right"></i></span>
                                    <span class="text">등록</span>
                                </a>
                            </td> 
                        </tr>
                 
                  </tbody>
                </table>
          </div>
          </form>
          <div class="card shadow mb-4">
           <a href="#collapseOfferTable" class="d-block card-header py-3" data-toggle="collapse" role="button" aria-expanded="false" aria-controls="collapseOfferTable">
                  <h6 class="m-0 font-weight-bold text-primary">헌금 이력</h6>                
           </a>            
            <div class="collapse" id="collapseOfferTable">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>일련번호</th>
                      <th>헌금일</th>
                      <th>입력일</th>
                      <th>수정일</th>
                      <th>헌금종류</th>
                      <th>헌금액</th>
                      <th style="width:100px;">비고</th>                      
                    </tr>
                  </thead>                  
                  <tbody>
                    <c:forEach var="offer" items="${offerList}">
                        <tr>
                            <th>${offer.seq}</th>
                            <td>${offer.offer_dtm}</td>  
                            <td>${offer.input_dtm}</td>                        
                            <td>${offer.mod_dtm}</td>                   
                            <td>${offer.offer_typ_cd}</td>                        
                            <td>${offer.offer_val}원</td>  
                            <td>
                                <a href="javascript:goModify('${offer.seq}')" class="btn btn-secondary btn-icon-split">
                                    <span class="icon text-white-50"><i class="fas fa-arrow-right"></i></span>
                                    <span class="text">수정</span>
                                </a>
                                <a href="#" class="btn btn-danger btn-icon-split">
				                    <span class="icon text-white-50"><i class="fas fa-trash"></i></span>
				                    <span class="text">삭제</span>
				                </a>
                            </td> 
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