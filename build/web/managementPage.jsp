<%-- 
    Document   : managementPage
    Created on : Jul 8, 2022, 7:24:21 PM
    Author     : Vo Viet Nhan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Book in Stock</title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="css/styles.css" rel="stylesheet" />
         <link rel="icon" href="image/logo.png">
        <script src="https://use.fontawesome.com/releases/v6.1.0/js/all.js" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script type="text/javascript">
            function JSalert() {
                swal({
                    title: "Are you sure?",
                    text: "Do you really want to log out this book? Click OK to log out.",
                    buttons: true,
                })
                        .then((willDelete) => {
                            if (willDelete) {
                                window.location.href = "firstpage.jsp";
                            } else {
                                swal("You still stay in the PR library!");
                            }
                        });
            }

            function JSDelete() {
                swal({
                    title: "Are you sure?",
                    text: "Do you really want to log out this book? Click OK to log out.",
                    buttons: true,
                })
                        .then((deleteBook) => {
                            if (deleteBook) {
                                swal("deleted!");
                            } else {
                                swal("Book still availible!");
                            }
                        });
            }
        </script>
    </head>

    <body class="sb-nav-fixed">
        <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
            <!-- Navbar Brand-->
            <a class="navbar-brand ps-3" href="adminPage.jsp" style="width: 65px; height: 50px; margin-bottom: 17px;  "><img src="image/logo.png" style="position: relative;
                                                               width: 50px; height: 50px; margin: 5px;"></a>
            <a class="navbar-brand ps-3" href="adminPage.jsp">Manage OGLIU Library</a>
            <!-- Sidebar Toggle-->
            <!--        <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i
                            class="fas fa-bars"></i></button>-->
            <!-- Navbar Search-->

            <ul class="navbar-nav ml-auto mb-2 mb-lg-0" style="margin-left: auto;">
                <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0" style="padding:8px;">

                </form>
                <li class="nav-item mx-2">
                    <a style="font-size: 150%; " class="nav-link nav-link-1 ">Hello: ${sessionScope.admin.fullname}</a>
                </li>
            </ul>
            <!-- Navbar-->
            <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
                    <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                        <!-- <li><a class="dropdown-item" href="#!">Settings</a></li>
                        <li><a class="dropdown-item" href="#!">Activity Log</a></li>
                        <li>
                            <hr class="dropdown-divider" />
                        </li> -->
                        <li><a class="dropdown-item" onclick="return JSalert()">Logout</a></li>
                        
                    </ul>
                </li>
            </ul>
        </nav>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                    <div class="sb-sidenav-menu">
                        <div class="nav">
                            <div class="sb-sidenav-menu-heading">Core</div>
                            <a class="nav-link" href="adminPage.jsp">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                Home
                            </a>
                            <div class="sb-sidenav-menu-heading">Interface</div>
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse"
                               data-bs-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                                Book
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapseLayouts" aria-labelledby="headingOne"
                                 data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="DetailBook">Book in Stock</a>
                                    <a class="nav-link" href="BillDetail">Waiting Bill</a>
                                    <a class="nav-link" href="BillProcessedDetail">Processed Bill</a>
                                    <a class="nav-link" href="BillCompletedDetail">Completed Bill</a>
                                </nav>
                            </div>
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapsePages"
                               aria-expanded="false" aria-controls="collapsePages">
                                <div class="sb-nav-link-icon"><i class="fas fa-book-open"></i></div>
                                People
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapsePages" aria-labelledby="headingTwo"
                                 data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav accordion" id="sidenavAccordionPages">
                                    <a class="nav-link collapsed" href="UserDetail">
                                        List of User
                                    </a>

                                    <a class="nav-link collapsed" href="AdminDetail">
                                        List of Admin
                                    </a>

                                </nav>
                            </div>

                        </div>
                    </div>
                    <div class="sb-sidenav-footer">
                        <div class="small">Logged in as:</div>
                        Start Bootstrap
                    </div>
                </nav>
            </div>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Manage Book</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item active"></li>
                        </ol>

                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table me-1"></i>
                                Book Information
                                <a href="insertBook.jsp"><button type="submit" class="btn btn-outline-primary">Add new book</button></a>
                            </div>
                            <div class="card-body">
                                <table id="datatablesSimple" style="border: 1px solid black">
                                    <tr style="border: 1px solid black ">
                                        <td style="border: 1px solid black;text-align: center;">ID</td>
                                        <td style="border: 1px solid black;text-align: center;">IMAGE</td>
                                        <td style="border: 1px solid black;text-align: center;">NAME</td>
                                        <td style="border: 1px solid black;text-align: center;">AUTHOR</td>
                                        <td style="border: 1px solid black;text-align: center;">LANGUAGE</td>
                                        <td style="border: 1px solid black;text-align: center;">TYPE</td>                                      
                                        <td style="border: 1px solid black;text-align: center;">PUBLISHER</td>
                            
                                        <td style="border: 1px solid black;padding: 0 15px; text-align: center;">AMOUNT</td>
                                    </tr>
                                    <c:forEach items="${listB}" var="o">
                                        <tr style="border: 1px solid black;" >
                                            <td style="border: 1px solid black;padding: 0 15px;text-align: center;">${o.id}</td>                                        
                                            <td style="border: 1px solid black;padding: 0 auto;text-align: center;"><img src="${o.image}" style="width: 100px;"></td>
                                            <td style="border: 1px solid black;padding: 0 15px;text-align: center;">${o.name}</td>
                                            <td style="border: 1px solid black;padding: 0 15px;text-align: center;">${o.author}</td>
                                            <td style="border: 1px solid black;padding: 0 15px;text-align: center;">${o.language}</td>
                                            <td style="border: 1px solid black;padding: 0 15px;text-align: center;">${o.type}</td>
                                            <td style="border: 1px solid black;padding: 0 15px;text-align: center;">${o.publisher}</td>
     
                                            <td style="border: 1px solid black;padding: 0 15px;text-align: center;">${o.amount}</td>
                                            <td>
                                                <a href="update?bid=${o.id}"><button type="submit" class="btn btn-outline-primary" >Update</button></a></a>
                                        <button type="submit" class="btn btn-outline-primary" onclick="return JSDelete">Delete</button>
<!--                                                <li><a class="dropdown-item" onclick="return JSDelete()">Delete</a></li>-->
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </table>
                            </div>
                        </div>
                    </div>
                </main>
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Group 02</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
        <script src="assets/demo/chart-area-demo.js"></script>
        <script src="assets/demo/chart-bar-demo.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
        <script src="js/datatables-simple-demo.js"></script>
    </body>

</html>