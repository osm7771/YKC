<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">헌금 관리 시스템</div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <li class="nav-item">
        <a class="nav-link" href="index.html">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>내 정보</span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider">

      <!-- Heading -->
      <div class="sidebar-heading">
        	인원 관리
      </div>

      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
          <i class="fas fa-fw fa-cog"></i>
          <span>성도 관리</span>
        </a>
        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">성도 관리</h6>
            <a class="collapse-item" href="/member/list">명단</a>
            <a class="collapse-item" href="/member/form">입력</a>
          </div>
        </div>
      </li>

      <!-- Nav Item - Utilities Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities" aria-expanded="true" aria-controls="collapseUtilities">
          <i class="fas fa-fw fa-wrench"></i>
          <span>가정 관리</span>
        </a>
        <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">Custom Utilities:</h6>
            <a class="collapse-item" href="utilities-color.html">Colors</a>
            <a class="collapse-item" href="utilities-border.html">Borders</a>
            <a class="collapse-item" href="utilities-animation.html">Animations</a>
            <a class="collapse-item" href="utilities-other.html">Other</a>
          </div>
        </div>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider">

      <!-- Heading -->
      <div class="sidebar-heading">
        	<span>헌금 관리</span>
      </div>

      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseOfferView" aria-expanded="true" aria-controls="collapseOfferView">
          <i class="fas fa-fw fa-folder"></i>
          <span>헌금 조회</span>
        </a>
        <div id="collapseOfferView" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">개별</h6>
            <a class="collapse-item" href="/offer/searchMemb">성도별 조회</a>
            <a class="collapse-item" href="/offer/searchTyp">항목별 조회</a>            
            <div class="collapse-divider"></div>
            <h6 class="collapse-header">종합</h6>
            <a class="collapse-item" href="/offer/searchMembTotal">성도별 종합</a>
            <a class="collapse-item" href="/offer/searchTypTotal">항목별 종합</a>   
          </div>
        </div>
      </li>

      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseOfferInsert" aria-expanded="true" aria-controls="collapseOfferInsert">
          <i class="fas fa-fw fa-folder"></i>
          <span>헌금 입력</span>
        </a>
        <div id="collapseOfferInsert" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">            
            <h6 class="collapse-header">개별 입력</h6>
            <a class="collapse-item" href="/offer/membList">성도별 입력</a>
            <a class="collapse-item" href="/offer/offerMembList">항목별 입력</a>
            <h6 class="collapse-header">조회</h6>
            <a class="collapse-item" href="/offer/searchM">성도별 종합</a>
            <a class="collapse-item" href="register.html">항목별 종합</a>            
            <div class="collapse-divider"></div>
          </div>
        </div>
      </li>   

      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>