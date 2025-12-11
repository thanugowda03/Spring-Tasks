package com.xworkz.task;

import com.xworkz.task.Dto.*;
import com.xworkz.task.coreConfig.CoreConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        System.out.println("main started");
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(CoreConfiguration.class) ;

        List<EmployeeDTO> employeeDTOS=applicationContext.getBean("getEmployee",List.class);
        employeeDTOS.stream().forEach(System.out::println);
        System.out.println("------------------------------------------------------");
        List<AccountDTO> accountDTOS=applicationContext.getBean("getAccounts",List.class);
        accountDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<ApartmentDTO> appartmentDTOS=applicationContext.getBean("getApartments",List.class);
        appartmentDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<AuthorDTO> authorDTOS=applicationContext.getBean("getAuthors",List.class);
        authorDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<AdminDTO> adminDTOS=applicationContext.getBean("getAdmins",List.class);
        adminDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<BookDTO> bookDTOS=applicationContext.getBean("getBooks",List.class);
        bookDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<CompanyDTO> companyDTOS=applicationContext.getBean("getCompanies",List.class);
        companyDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<CourseDTO> courseDTOS=applicationContext.getBean("getCourses",List.class);
        courseDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<CustomerDTO> customerDTOS=applicationContext.getBean("getCustomers",List.class);
        customerDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<DeliveryDTO> deliveryDTOS=applicationContext.getBean("getDeliveries",List.class);
        deliveryDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<DepartmentDTO> departmentDTOS=applicationContext.getBean("getDepartments",List.class);
        departmentDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<DoctorDTO> doctorDTOS=applicationContext.getBean("getDoctors",List.class);
        doctorDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<EmployeeDTO> employeeDTOS1=applicationContext.getBean("getEmployees",List.class);
        employeeDTOS1.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<FoodDTO>foodDTOS=applicationContext.getBean("getFoods",List.class);
        foodDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<HotelDTO>hotelDTOS=applicationContext.getBean("getHotels",List.class);
        hotelDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<ItemDTO> itemDTOS=applicationContext.getBean("getItems",List.class);
        itemDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<LibraryDTO> libraryDTOS=applicationContext.getBean("getLibraries",List.class);
        libraryDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<LoanDTO> loanDTOS=applicationContext.getBean("getLoans",List.class);
        loanDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<ManagerDTO> managerDTOS=applicationContext.getBean("getManagers",List.class);
        managerDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<MovieDTO> movieDTOS=applicationContext.getBean("getMovies",List.class);
        movieDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<OrderDTO> orderDTOS=applicationContext.getBean("getOrders",List.class);
        orderDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<PatientDTO> patientDTOS=applicationContext.getBean("getPatients",List.class);
        patientDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<PaymentDTO> paymentDTOS=applicationContext.getBean("getPayments",List.class);
        paymentDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<PersonDTO> personDTOS=applicationContext.getBean("getPersons",List.class);
        personDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<ProductDTO> productDTOS=applicationContext.getBean("getProducts",List.class);
        productDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<RestaurantDTO> restaurantDTOS=applicationContext.getBean("getRestaurants",List.class);
        restaurantDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<RoomDTO> roomDTOS=applicationContext.getBean("getRooms",List.class);
        roomDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<SellerDTO> sellerDTOS=applicationContext.getBean("getSellers",List.class);
        sellerDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<ShopDTO> shopDTOS=applicationContext.getBean("getShops",List.class);
        shopDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<StudentDTO> studentDTOS=applicationContext.getBean("getStudents",List.class);
        studentDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<TeacherDTO> teacherDTOS=applicationContext.getBean("getTeachers",List.class);
        teacherDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<TicketDTO> ticketDTOS=applicationContext.getBean("getTickets",List.class);
        ticketDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");


        List<TrainerDTO> trainerDTOS=applicationContext.getBean("getTrainers",List.class);
        trainerDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<TrainerRecordDTO> trainerRecordDTOS=applicationContext.getBean("getTrainerRecords",List.class);
        trainerRecordDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<VehicleDTO> vehicleDTOS=applicationContext.getBean("getVehicles",List.class);
        vehicleDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        List<VendorDTO> vendorDTOS=applicationContext.getBean("getVendors",List.class);
        vendorDTOS.stream().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");

        System.out.println("main ended");
    }
}
