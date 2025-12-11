package com.xworkz.task.coreConfig;


import com.xworkz.task.Dto.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.xworkz.task.coreConfig")

public class CoreConfiguration {
         public CoreConfiguration() {
             System.out.println("Configuration is invoked");
         }
            @Bean("getEmployee")
                    public List<EmployeeDTO>getEmployee(){
                List<EmployeeDTO>employeeDTOS=new ArrayList<>();
                EmployeeDTO emp1=new EmployeeDTO(1,"Thanushree",22,"Female","thanu@gmail.com","tanu@123",9483526695l,"Sullia");
                EmployeeDTO emp2=new EmployeeDTO(2,"Yashaswini",21,"Female","yashu@gmail.com","yashu@123",7783526695l,"Badhravathi");
                EmployeeDTO emp3  = new EmployeeDTO(3,"Priya",23,"Female","priya23@gmail.com","priya@123",9090909090L,"Mysuru");
                EmployeeDTO emp4  = new EmployeeDTO(4,"Karthik",27,"Male","karthik27@gmail.com","karthik@123",9123456780L,"Tumakuru");
                EmployeeDTO emp5  = new EmployeeDTO(5,"Sahana",22,"Female","sahana22@gmail.com","sahana@123",9988776655L,"Shimoga");
                EmployeeDTO emp6  = new EmployeeDTO(6,"Manoj",29,"Male","manoj@gmail.com","manoj@123",9345678123L,"Chikkamagaluru");
                EmployeeDTO emp7  = new EmployeeDTO(7,"Deepika",24,"Female","deepika24@gmail.com","deepika@123",8090809080L,"Davangere");
                EmployeeDTO emp8  = new EmployeeDTO(8,"Abhishek",28,"Male","abhishek28@gmail.com","abhi@123",9012345678L,"Udupi");
                EmployeeDTO emp9  = new EmployeeDTO(9,"Lavanya",26,"Female","lavanya26@gmail.com","lav@123",9786543210L,"Hassan");
                EmployeeDTO emp10 = new EmployeeDTO(10,"Sharath",30,"Male","sharath30@gmail.com","sharath@123",8899776655L,"Mandya");
                EmployeeDTO emp11 = new EmployeeDTO(11,"Nisha",22,"Female","nisha22@gmail.com","nisha@123",7766554433L,"Ballari");
                EmployeeDTO emp12 = new EmployeeDTO(12,"Varun",24,"Male","varun24@gmail.com","varun@123",9678543210L,"Hubballi");
                EmployeeDTO emp13 = new EmployeeDTO(13,"Aishwarya",25,"Female","aishu@gmail.com","aishu@123",8877665544L,"Belagavi");
                EmployeeDTO emp14 = new EmployeeDTO(14,"Rakesh",28,"Male","rakesh@gmail.com","rakesh@123",9034567812L,"Gadag");
                EmployeeDTO emp15 = new EmployeeDTO(15,"Sindhu",23,"Female","sindhu23@gmail.com","sindhu@123",9445566778L,"Raichur");

                employeeDTOS.add(emp1);
                employeeDTOS.add(emp2);
                employeeDTOS.add(emp3);
                employeeDTOS.add(emp4);
                employeeDTOS.add(emp5);
                employeeDTOS.add(emp6);
                employeeDTOS.add(emp7);
                employeeDTOS.add(emp8);
                employeeDTOS.add(emp9);
                employeeDTOS.add(emp10);
                employeeDTOS.add(emp11);
                employeeDTOS.add(emp12);
                employeeDTOS.add(emp13);
                employeeDTOS.add(emp14);
                employeeDTOS.add(emp15);
                return employeeDTOS;
             }

    @Bean("getAccounts")
    public List<AccountDTO> getAccounts() {

        List<AccountDTO> accountList = new ArrayList<>();

        AccountDTO a1  = new AccountDTO(1, "Rohit", 25, "Savings", "rohit@gmail.com", "rohit@123", 9876543210L, "Bengaluru");
        AccountDTO a2  = new AccountDTO(2, "Sneha", 23, "Current", "sneha@gmail.com", "sneha@123", 9090909090L, "Mysuru");
        AccountDTO a3  = new AccountDTO(3, "Kiran", 30, "Salary", "kiran@gmail.com", "kiran@123", 9988776655L, "Hubballi");
        AccountDTO a4  = new AccountDTO(4, "Pooja", 28, "Savings", "pooja@gmail.com", "pooja@123", 9123456780L, "Shivamogga");
        AccountDTO a5  = new AccountDTO(5, "Ravi", 35, "Current", "ravi@gmail.com", "ravi@123", 8877665544L, "Davangere");
        AccountDTO a6  = new AccountDTO(6, "Megha", 26, "Salary", "megha@gmail.com", "megha@123", 9345678123L, "Udupi");
        AccountDTO a7  = new AccountDTO(7, "Harish", 29, "Savings", "harish@gmail.com", "harish@123", 8090809080L, "Hassan");
        AccountDTO a8  = new AccountDTO(8, "Anusha", 24, "Current", "anusha@gmail.com", "anusha@123", 9012345678L, "Tumakuru");
        AccountDTO a9  = new AccountDTO(9, "Sudeep", 32, "Salary", "sudeep@gmail.com", "sudeep@123", 9786543210L, "Mandya");
        AccountDTO a10 = new AccountDTO(10, "Divya", 27, "Savings", "divya@gmail.com", "divya@123", 8899776655L, "Ballari");
        AccountDTO a11 = new AccountDTO(11, "Nandan", 28, "Current", "nandan@gmail.com", "nandan@123", 7766554433L, "Belagavi");
        AccountDTO a12 = new AccountDTO(12, "Keerthi", 25, "Savings", "keerthi@gmail.com", "keerthi@123", 9678543210L, "Gadag");
        AccountDTO a13 = new AccountDTO(13, "Arun", 31, "Salary", "arun@gmail.com", "arun@123", 8877665588L, "Raichur");
        AccountDTO a14 = new AccountDTO(14, "Swathi", 29, "Savings", "swathi@gmail.com", "swathi@123", 9034567812L, "Chikkamagaluru");
        AccountDTO a15 = new AccountDTO(15, "Vikram", 33, "Current", "vikram@gmail.com", "vikram@123", 9445566778L, "Mangaluru");

        accountList.add(a1);
        accountList.add(a2);
        accountList.add(a3);
        accountList.add(a4);
        accountList.add(a5);
        accountList.add(a6);
        accountList.add(a7);
        accountList.add(a8);
        accountList.add(a9);
        accountList.add(a10);
        accountList.add(a11);
        accountList.add(a12);
        accountList.add(a13);
        accountList.add(a14);
        accountList.add(a15);

        return accountList;
    }
    @Bean("getAdmins")
    public List<AdminDTO> getAdmins() {

        List<AdminDTO> adminDTOS = new ArrayList<>();

        AdminDTO ad1  = new AdminDTO(1,  "Raghav",     32, "Manager",      "raghav@gmail.com",      "rag@123",  9876543210L, "Bengaluru");
        AdminDTO ad2  = new AdminDTO(2,  "Sowmya",     28, "Supervisor",   "sowmya@gmail.com",      "sow@123",  9988776655L, "Mysuru");
        AdminDTO ad3  = new AdminDTO(3,  "Umesh",      35, "Coordinator",  "umesh@gmail.com",       "ume@123",  7766554433L, "Hubballi");
        AdminDTO ad4  = new AdminDTO(4,  "Revathi",    30, "Team Lead",    "revathi@gmail.com",     "rev@123",  9123456781L, "Shivamogga");
        AdminDTO ad5  = new AdminDTO(5,  "Pramod",     29, "Assistant",    "pramod@gmail.com",      "pra@123",  9090909090L, "Belagavi");
        AdminDTO ad6  = new AdminDTO(6,  "Sandhya",    26, "Clerk",        "sandhya@gmail.com",     "san@123",  9345678123L, "Tumakuru");
        AdminDTO ad7  = new AdminDTO(7,  "Vijay",      38, "Admin Head",   "vijay@gmail.com",       "vij@123",  8090808080L, "Hassan");
        AdminDTO ad8  = new AdminDTO(8,  "Varsha",     27, "Support",      "varsha@gmail.com",      "var@123",  9012345678L, "Mandya");
        AdminDTO ad9  = new AdminDTO(9,  "Harish",     33, "Assistant",    "harish@gmail.com",      "har@123",  9786543210L, "Udupi");
        AdminDTO ad10 = new AdminDTO(10, "Kavya",      25, "Operator",     "kavya@gmail.com",       "kav@123",  8899776655L, "Davangere");
        AdminDTO ad11 = new AdminDTO(11, "Manoj",      36, "Team Lead",    "manoj@gmail.com",       "man@123",  7766551122L, "Ballari");
        AdminDTO ad12 = new AdminDTO(12, "Swati",      31, "Clerk",        "swati@gmail.com",       "swa@123",  9678543210L, "Raichur");
        AdminDTO ad13 = new AdminDTO(13, "Girish",     37, "Manager",      "girish@gmail.com",      "gir@123",  8877665544L, "Kolar");
        AdminDTO ad14 = new AdminDTO(14, "Anita",      29, "Assistant",    "anita@gmail.com",       "ani@123",  9034567812L, "Chikkamagaluru");
        AdminDTO ad15 = new AdminDTO(15, "Yogesh",     34, "Supervisor",   "yogesh@gmail.com",      "yog@123",  9445566778L, "Kalaburagi");

        adminDTOS.add(ad1);
        adminDTOS.add(ad2);
        adminDTOS.add(ad3);
        adminDTOS.add(ad4);
        adminDTOS.add(ad5);
        adminDTOS.add(ad6);
        adminDTOS.add(ad7);
        adminDTOS.add(ad8);
        adminDTOS.add(ad9);
        adminDTOS.add(ad10);
        adminDTOS.add(ad11);
        adminDTOS.add(ad12);
        adminDTOS.add(ad13);
        adminDTOS.add(ad14);
        adminDTOS.add(ad15);

        return adminDTOS;
    }
    @Bean("getApartments")
    public List<ApartmentDTO> getApartments() {

        List<ApartmentDTO> apartmentDTOS = new ArrayList<>();

        ApartmentDTO apt1  = new ApartmentDTO(1,  "Sunshine Residency", 10, "Residential", "sunshine@gmail.com", "sun@123", 9876543210L, "Bengaluru");
        ApartmentDTO apt2  = new ApartmentDTO(2,  "Green Valley",       12, "Residential", "greenvalley@gmail.com", "green@123", 9988776655L, "Mysuru");
        ApartmentDTO apt3  = new ApartmentDTO(3,  "Skyline Towers",     15, "Residential", "skyline@gmail.com", "sky@123", 7766554433L, "Hubballi");
        ApartmentDTO apt4  = new ApartmentDTO(4,  "Ocean View",         8,  "Residential", "oceanview@gmail.com", "ocean@123", 9123456781L, "Shivamogga");
        ApartmentDTO apt5  = new ApartmentDTO(5,  "Silver Oaks",        9,  "Residential", "silveroaks@gmail.com", "silver@123", 9090909090L, "Belagavi");
        ApartmentDTO apt6  = new ApartmentDTO(6,  "Maple Residency",    11, "Residential", "maple@gmail.com", "maple@123", 9345678123L, "Tumakuru");
        ApartmentDTO apt7  = new ApartmentDTO(7,  "Lotus Apartments",   7,  "Residential", "lotus@gmail.com", "lotus@123", 8090808080L, "Hassan");
        ApartmentDTO apt8  = new ApartmentDTO(8,  "Crystal Heights",    13, "Residential", "crystal@gmail.com", "crys@123", 9012345678L, "Mandya");
        ApartmentDTO apt9  = new ApartmentDTO(9,  "Pearl Residency",    14, "Residential", "pearl@gmail.com", "pearl@123", 9786543210L, "Udupi");
        ApartmentDTO apt10 = new ApartmentDTO(10, "Harmony Towers",     10, "Residential", "harmony@gmail.com", "harm@123", 8899776655L, "Davangere");
        ApartmentDTO apt11 = new ApartmentDTO(11, "Sunset Boulevard",   12, "Residential", "sunset@gmail.com", "sunset@123", 7766551122L, "Ballari");
        ApartmentDTO apt12 = new ApartmentDTO(12, "Emerald Residency",  9,  "Residential", "emerald@gmail.com", "emer@123", 9678543210L, "Raichur");
        ApartmentDTO apt13 = new ApartmentDTO(13, "Maple Grove",        8,  "Residential", "maplegrove@gmail.com", "mgrove@123", 8877665544L, "Kalaburagi");
        ApartmentDTO apt14 = new ApartmentDTO(14, "Blue Sky Towers",    11, "Residential", "bluesky@gmail.com", "blue@123", 9034567812L, "Kolar");
        ApartmentDTO apt15 = new ApartmentDTO(15, "Golden Residency",   15, "Residential", "golden@gmail.com", "gold@123", 9445566778L, "Chikkamagaluru");

        apartmentDTOS.add(apt1);
        apartmentDTOS.add(apt2);
        apartmentDTOS.add(apt3);
        apartmentDTOS.add(apt4);
        apartmentDTOS.add(apt5);
        apartmentDTOS.add(apt6);
        apartmentDTOS.add(apt7);
        apartmentDTOS.add(apt8);
        apartmentDTOS.add(apt9);
        apartmentDTOS.add(apt10);
        apartmentDTOS.add(apt11);
        apartmentDTOS.add(apt12);
        apartmentDTOS.add(apt13);
        apartmentDTOS.add(apt14);
        apartmentDTOS.add(apt15);

        return apartmentDTOS;
    }
    @Bean("getAuthors")
    public List<AuthorDTO> getAuthors() {

        List<AuthorDTO> authorDTOS = new ArrayList<>();

        AuthorDTO auth1  = new AuthorDTO(1,  "Ravi Kumar",     45, "Fiction",       "ravi@gmail.com",     "ravi@123",  9876543210L, "Bengaluru");
        AuthorDTO auth2  = new AuthorDTO(2,  "Anita Sharma",   38, "Poetry",        "anita@gmail.com",    "anit@123",  9988776655L, "Mysuru");
        AuthorDTO auth3  = new AuthorDTO(3,  "Suresh Patil",   50, "Biography",     "suresh@gmail.com",   "sur@123",   7766554433L, "Hubballi");
        AuthorDTO auth4  = new AuthorDTO(4,  "Priya Rao",      33, "Children",      "priya@gmail.com",    "priya@123", 9123456781L, "Shivamogga");
        AuthorDTO auth5  = new AuthorDTO(5,  "Vikram Singh",   42, "Science Fiction","vikram@gmail.com",  "vik@123",   9090909090L, "Belagavi");
        AuthorDTO auth6  = new AuthorDTO(6,  "Megha Reddy",    36, "Romance",       "megha@gmail.com",    "meg@123",   9345678123L, "Tumakuru");
        AuthorDTO auth7  = new AuthorDTO(7,  "Harish Bhat",    48, "Mystery",       "harish@gmail.com",   "har@123",   8090808080L, "Hassan");
        AuthorDTO auth8  = new AuthorDTO(8,  "Kavya Nair",     29, "Drama",         "kavya@gmail.com",    "kav@123",   9012345678L, "Mandya");
        AuthorDTO auth9  = new AuthorDTO(9,  "Rakesh Joshi",   55, "History",       "rakesh@gmail.com",   "rak@123",   9786543210L, "Udupi");
        AuthorDTO auth10 = new AuthorDTO(10, "Anusha Patil",   31, "Thriller",      "anusha@gmail.com",   "anu@123",   8899776655L, "Davangere");
        AuthorDTO auth11 = new AuthorDTO(11, "Manoj Kumar",    44, "Adventure",     "manoj@gmail.com",    "man@123",   7766551122L, "Ballari");
        AuthorDTO auth12 = new AuthorDTO(12, "Divya Rani",     35, "Fiction",       "divya@gmail.com",    "div@123",   9678543210L, "Raichur");
        AuthorDTO auth13 = new AuthorDTO(13, "Girish Naik",    47, "Poetry",        "girish@gmail.com",   "gir@123",   8877665544L, "Kalaburagi");
        AuthorDTO auth14 = new AuthorDTO(14, "Sneha Rao",      32, "Romance",       "sneha@gmail.com",    "sne@123",   9034567812L, "Kolar");
        AuthorDTO auth15 = new AuthorDTO(15, "Yogesh Bhat",    49, "Mystery",       "yogesh@gmail.com",   "yog@123",   9445566778L, "Chikkamagaluru");

        authorDTOS.add(auth1);
        authorDTOS.add(auth2);
        authorDTOS.add(auth3);
        authorDTOS.add(auth4);
        authorDTOS.add(auth5);
        authorDTOS.add(auth6);
        authorDTOS.add(auth7);
        authorDTOS.add(auth8);
        authorDTOS.add(auth9);
        authorDTOS.add(auth10);
        authorDTOS.add(auth11);
        authorDTOS.add(auth12);
        authorDTOS.add(auth13);
        authorDTOS.add(auth14);
        authorDTOS.add(auth15);

        return authorDTOS;
    }
    @Bean("getBooks")
    public List<BookDTO> getBooks() {

        List<BookDTO> bookDTOS = new ArrayList<>();

        BookDTO book1  = new BookDTO(1,  "The Alchemist",        197, "Fiction",       "alchemist@gmail.com", "alc@123", 9876543210L, "A1");
        BookDTO book2  = new BookDTO(2,  "Rich Dad Poor Dad",     207, "Finance",       "richdad@gmail.com",  "rd@123",  9988776655L, "B1");
        BookDTO book3  = new BookDTO(3,  "Harry Potter",          350, "Fantasy",       "harry@gmail.com",   "hp@123",  7766554433L, "C1");
        BookDTO book4  = new BookDTO(4,  "The Silent Patient",    325, "Thriller",      "silent@gmail.com",  "sp@123",  9123456781L, "D1");
        BookDTO book5  = new BookDTO(5,  "To Kill a Mockingbird",281, "Classic",       "mockingbird@gmail.com", "tk@123", 9090909090L, "E1");
        BookDTO book6  = new BookDTO(6,  "Atomic Habits",         320, "Self-Help",     "atomic@gmail.com",  "ah@123",  9345678123L, "F1");
        BookDTO book7  = new BookDTO(7,  "The Great Gatsby",      180, "Classic",       "gatsby@gmail.com",  "gg@123",  8090808080L, "G1");
        BookDTO book8  = new BookDTO(8,  "The Hobbit",            295, "Fantasy",       "hobbit@gmail.com",  "hob@123", 9012345678L, "H1");
        BookDTO book9  = new BookDTO(9,  "Educated",              334, "Biography",     "educated@gmail.com","edu@123", 9786543210L, "I1");
        BookDTO book10 = new BookDTO(10, "1984",                  328, "Dystopian",     "1984@gmail.com",    "nin@123", 8899776655L, "J1");
        BookDTO book11 = new BookDTO(11, "Becoming",              400, "Autobiography", "becoming@gmail.com","bcm@123", 7766551122L, "K1");
        BookDTO book12 = new BookDTO(12, "Thinking Fast & Slow",  499, "Psychology",    "thinking@gmail.com","ts@123",  9678543210L, "L1");
        BookDTO book13 = new BookDTO(13, "Pride and Prejudice",   279, "Classic",       "pride@gmail.com",   "pp@123",  8877665544L, "M1");
        BookDTO book14 = new BookDTO(14, "The Subtle Art of Not Giving a F*ck", 224, "Self-Help","subtle@gmail.com", "sa@123", 9034567812L, "N1");
        BookDTO book15 = new BookDTO(15, "The Catcher in the Rye", 277, "Classic",      "catcher@gmail.com", "cr@123", 9445566778L, "O1");

        bookDTOS.add(book1);
        bookDTOS.add(book2);
        bookDTOS.add(book3);
        bookDTOS.add(book4);
        bookDTOS.add(book5);
        bookDTOS.add(book6);
        bookDTOS.add(book7);
        bookDTOS.add(book8);
        bookDTOS.add(book9);
        bookDTOS.add(book10);
        bookDTOS.add(book11);
        bookDTOS.add(book12);
        bookDTOS.add(book13);
        bookDTOS.add(book14);
        bookDTOS.add(book15);

        return bookDTOS;
    }
    @Bean("getCompanies")
    public List<CompanyDTO> getCompanies() {

        List<CompanyDTO> companyDTOS = new ArrayList<>();

        CompanyDTO comp1  = new CompanyDTO(1,  "TechSolutions",       250, "IT",        "tech@gmail.com",     "tech@123", 9876543210L, "Bengaluru");
        CompanyDTO comp2  = new CompanyDTO(2,  "GreenEnergy",         150, "Energy",    "green@gmail.com",    "green@123", 9988776655L, "Mysuru");
        CompanyDTO comp3  = new CompanyDTO(3,  "Skyline Builders",    300, "Construction","skyline@gmail.com", "sky@123",  7766554433L, "Hubballi");
        CompanyDTO comp4  = new CompanyDTO(4,  "Oceanic Foods",       120, "Food",      "oceanic@gmail.com",  "ocean@123", 9123456781L, "Shivamogga");
        CompanyDTO comp5  = new CompanyDTO(5,  "SilverTech",          200, "IT",        "silver@gmail.com",   "silver@123",9090909090L, "Belagavi");
        CompanyDTO comp6  = new CompanyDTO(6,  "Maple Logistics",     180, "Transport", "maple@gmail.com",    "maple@123", 9345678123L, "Tumakuru");
        CompanyDTO comp7  = new CompanyDTO(7,  "Lotus Enterprises",   220, "Manufacturing", "lotus@gmail.com", "lotus@123", 8090808080L, "Hassan");
        CompanyDTO comp8  = new CompanyDTO(8,  "Crystal Media",       140, "Media",     "crystal@gmail.com",  "crys@123",  9012345678L, "Mandya");
        CompanyDTO comp9  = new CompanyDTO(9,  "Pearl Innovations",   260, "IT",        "pearl@gmail.com",    "pearl@123", 9786543210L, "Udupi");
        CompanyDTO comp10 = new CompanyDTO(10, "Harmony Solutions",   190, "Consulting","harmony@gmail.com",  "harm@123", 8899776655L, "Davangere");
        CompanyDTO comp11 = new CompanyDTO(11, "Sunset Ventures",     210, "Finance",   "sunset@gmail.com",   "sunset@123",7766551122L, "Ballari");
        CompanyDTO comp12 = new CompanyDTO(12, "Emerald Systems",     230, "IT",        "emerald@gmail.com",  "emer@123",  9678543210L, "Raichur");
        CompanyDTO comp13 = new CompanyDTO(13, "Maple Grove Ltd",     170, "Construction", "maplegrove@gmail.com","mgrove@123",8877665544L, "Kalaburagi");
        CompanyDTO comp14 = new CompanyDTO(14, "Blue Sky Tech",       300, "IT",        "bluesky@gmail.com",  "blue@123",  9034567812L, "Kolar");
        CompanyDTO comp15 = new CompanyDTO(15, "Golden Enterprises",  250, "Manufacturing","golden@gmail.com", "gold@123", 9445566778L, "Chikkamagaluru");

        companyDTOS.add(comp1);
        companyDTOS.add(comp2);
        companyDTOS.add(comp3);
        companyDTOS.add(comp4);
        companyDTOS.add(comp5);
        companyDTOS.add(comp6);
        companyDTOS.add(comp7);
        companyDTOS.add(comp8);
        companyDTOS.add(comp9);
        companyDTOS.add(comp10);
        companyDTOS.add(comp11);
        companyDTOS.add(comp12);
        companyDTOS.add(comp13);
        companyDTOS.add(comp14);
        companyDTOS.add(comp15);

        return companyDTOS;
    }
    @Bean("getCourses")
    public List<CourseDTO> getCourses() {

        List<CourseDTO> courseDTOS = new ArrayList<>();

        CourseDTO course1  = new CourseDTO(1,  "Java Programming",        6,  "Beginner",      "java@gmail.com",      "java@123", 9876543210L, "Bengaluru");
        CourseDTO course2  = new CourseDTO(2,  "Python Programming",      4,  "Beginner",      "python@gmail.com",    "py@123",   9988776655L, "Mysuru");
        CourseDTO course3  = new CourseDTO(3,  "Web Development",         5,  "Intermediate",  "web@gmail.com",       "web@123",  7766554433L, "Hubballi");
        CourseDTO course4  = new CourseDTO(4,  "Data Science",            6,  "Advanced",      "datasci@gmail.com",   "ds@123",   9123456781L, "Shivamogga");
        CourseDTO course5  = new CourseDTO(5,  "Machine Learning",        6,  "Advanced",      "ml@gmail.com",        "ml@123",   9090909090L, "Belagavi");
        CourseDTO course6  = new CourseDTO(6,  "Digital Marketing",       3,  "Beginner",      "dm@gmail.com",        "dm@123",   9345678123L, "Tumakuru");
        CourseDTO course7  = new CourseDTO(7,  "Cloud Computing",         5,  "Intermediate",  "cloud@gmail.com",     "cl@123",   8090808080L, "Hassan");
        CourseDTO course8  = new CourseDTO(8,  "Cyber Security",          4,  "Intermediate",  "cyber@gmail.com",     "cy@123",   9012345678L, "Mandya");
        CourseDTO course9  = new CourseDTO(9,  "Blockchain",              6,  "Advanced",      "blockchain@gmail.com","bc@123",   9786543210L, "Udupi");
        CourseDTO course10 = new CourseDTO(10, "Artificial Intelligence", 6,  "Advanced",      "ai@gmail.com",        "ai@123",   8899776655L, "Davangere");
        CourseDTO course11 = new CourseDTO(11, "UI/UX Design",            3,  "Beginner",      "uiux@gmail.com",      "ux@123",   7766551122L, "Ballari");
        CourseDTO course12 = new CourseDTO(12, "ReactJS",                 4,  "Intermediate",  "react@gmail.com",     "re@123",   9678543210L, "Raichur");
        CourseDTO course13 = new CourseDTO(13, "Angular",                 4,  "Intermediate",  "angular@gmail.com",   "ang@123",  8877665544L, "Kalaburagi");
        CourseDTO course14 = new CourseDTO(14, "SQL & Databases",         5,  "Beginner",      "sql@gmail.com",       "sql@123",  9034567812L, "Kolar");
        CourseDTO course15 = new CourseDTO(15, "Spring Boot",             5,  "Intermediate",  "spring@gmail.com",    "sp@123",   9445566778L, "Chikkamagaluru");

        courseDTOS.add(course1);
        courseDTOS.add(course2);
        courseDTOS.add(course3);
        courseDTOS.add(course4);
        courseDTOS.add(course5);
        courseDTOS.add(course6);
        courseDTOS.add(course7);
        courseDTOS.add(course8);
        courseDTOS.add(course9);
        courseDTOS.add(course10);
        courseDTOS.add(course11);
        courseDTOS.add(course12);
        courseDTOS.add(course13);
        courseDTOS.add(course14);
        courseDTOS.add(course15);

        return courseDTOS;
    }
    @Bean("getCustomers")
    public List<CustomerDTO> getCustomers() {

        List<CustomerDTO> customerDTOS = new ArrayList<>();

        CustomerDTO cust1  = new CustomerDTO(1,  "Ramesh",     28, "Male",   "ramesh@gmail.com",    "ram@123",  9876543210L, "Bengaluru");
        CustomerDTO cust2  = new CustomerDTO(2,  "Sowmya",     25, "Female", "sowmya@gmail.com",    "sow@123",  9988776655L, "Mysuru");
        CustomerDTO cust3  = new CustomerDTO(3,  "Anil",       32, "Male",   "anil@gmail.com",      "ani@123",  7766554433L, "Hubballi");
        CustomerDTO cust4  = new CustomerDTO(4,  "Priya",      27, "Female", "priya@gmail.com",     "pri@123",  9123456781L, "Shivamogga");
        CustomerDTO cust5  = new CustomerDTO(5,  "Vikram",     30, "Male",   "vikram@gmail.com",    "vik@123",  9090909090L, "Belagavi");
        CustomerDTO cust6  = new CustomerDTO(6,  "Divya",      26, "Female", "divya@gmail.com",     "div@123",  9345678123L, "Tumakuru");
        CustomerDTO cust7  = new CustomerDTO(7,  "Harish",     35, "Male",   "harish@gmail.com",    "har@123",  8090808080L, "Hassan");
        CustomerDTO cust8  = new CustomerDTO(8,  "Kavya",      24, "Female", "kavya@gmail.com",     "kav@123",  9012345678L, "Mandya");
        CustomerDTO cust9  = new CustomerDTO(9,  "Rakesh",     33, "Male",   "rakesh@gmail.com",    "rak@123",  9786543210L, "Udupi");
        CustomerDTO cust10 = new CustomerDTO(10, "Anusha",     29, "Female", "anusha@gmail.com",    "anu@123",  8899776655L, "Davangere");
        CustomerDTO cust11 = new CustomerDTO(11, "Manoj",      31, "Male",   "manoj@gmail.com",     "man@123",  7766551122L, "Ballari");
        CustomerDTO cust12 = new CustomerDTO(12, "Swati",      27, "Female", "swati@gmail.com",     "swa@123",  9678543210L, "Raichur");
        CustomerDTO cust13 = new CustomerDTO(13, "Girish",     34, "Male",   "girish@gmail.com",    "gir@123",  8877665544L, "Kalaburagi");
        CustomerDTO cust14 = new CustomerDTO(14, "Sneha",      28, "Female", "sneha@gmail.com",     "sne@123",  9034567812L, "Kolar");
        CustomerDTO cust15 = new CustomerDTO(15, "Yogesh",     36, "Male",   "yogesh@gmail.com",    "yog@123",  9445566778L, "Chikkamagaluru");

        customerDTOS.add(cust1);
        customerDTOS.add(cust2);
        customerDTOS.add(cust3);
        customerDTOS.add(cust4);
        customerDTOS.add(cust5);
        customerDTOS.add(cust6);
        customerDTOS.add(cust7);
        customerDTOS.add(cust8);
        customerDTOS.add(cust9);
        customerDTOS.add(cust10);
        customerDTOS.add(cust11);
        customerDTOS.add(cust12);
        customerDTOS.add(cust13);
        customerDTOS.add(cust14);
        customerDTOS.add(cust15);

        return customerDTOS;
    }
    @Bean("getDeliveries")
    public List<DeliveryDTO> getDeliveries() {

        List<DeliveryDTO> deliveryDTOS = new ArrayList<>();

        DeliveryDTO del1  = new DeliveryDTO(1,  "Ramesh Courier",     60, "Bike",   "ramesh@gmail.com",   "ram@123", 9876543210L, "Bengaluru-Mysuru");
        DeliveryDTO del2  = new DeliveryDTO(2,  "Sowmya Express",     55, "Car",    "sowmya@gmail.com",   "sow@123", 9988776655L, "Mysuru-Hassan");
        DeliveryDTO del3  = new DeliveryDTO(3,  "Anil Logistics",     70, "Bike",   "anil@gmail.com",     "ani@123", 7766554433L, "Hubballi-Belagavi");
        DeliveryDTO del4  = new DeliveryDTO(4,  "Priya Delivery",     65, "Van",    "priya@gmail.com",    "pri@123", 9123456781L, "Shivamogga-Tumakuru");
        DeliveryDTO del5  = new DeliveryDTO(5,  "Vikram Couriers",    60, "Bike",   "vikram@gmail.com",   "vik@123", 9090909090L, "Belagavi-Udupi");
        DeliveryDTO del6  = new DeliveryDTO(6,  "Divya Express",      55, "Car",    "divya@gmail.com",    "div@123", 9345678123L, "Tumakuru-Mandya");
        DeliveryDTO del7  = new DeliveryDTO(7,  "Harish Logistics",   70, "Van",    "harish@gmail.com",   "har@123", 8090808080L, "Hassan-Davangere");
        DeliveryDTO del8  = new DeliveryDTO(8,  "Kavya Delivery",     60, "Bike",   "kavya@gmail.com",    "kav@123", 9012345678L, "Mandya-Bengaluru");
        DeliveryDTO del9  = new DeliveryDTO(9,  "Rakesh Couriers",    65, "Car",    "rakesh@gmail.com",   "rak@123", 9786543210L, "Udupi-Hassan");
        DeliveryDTO del10 = new DeliveryDTO(10, "Anusha Express",     70, "Van",    "anusha@gmail.com",   "anu@123", 8899776655L, "Davangere-Ballari");
        DeliveryDTO del11 = new DeliveryDTO(11, "Manoj Logistics",    60, "Bike",   "manoj@gmail.com",    "man@123", 7766551122L, "Ballari-Raichur");
        DeliveryDTO del12 = new DeliveryDTO(12, "Swati Delivery",     65, "Car",    "swati@gmail.com",    "swa@123", 9678543210L, "Raichur-Kolar");
        DeliveryDTO del13 = new DeliveryDTO(13, "Girish Couriers",    70, "Van",    "girish@gmail.com",   "gir@123", 8877665544L, "Kalaburagi-Chikkamagaluru");
        DeliveryDTO del14 = new DeliveryDTO(14, "Sneha Express",      60, "Bike",   "sneha@gmail.com",    "sne@123", 9034567812L, "Kolar-Bengaluru");
        DeliveryDTO del15 = new DeliveryDTO(15, "Yogesh Logistics",   65, "Car",    "yogesh@gmail.com",   "yog@123", 9445566778L, "Chikkamagaluru-Mysuru");

        deliveryDTOS.add(del1);
        deliveryDTOS.add(del2);
        deliveryDTOS.add(del3);
        deliveryDTOS.add(del4);
        deliveryDTOS.add(del5);
        deliveryDTOS.add(del6);
        deliveryDTOS.add(del7);
        deliveryDTOS.add(del8);
        deliveryDTOS.add(del9);
        deliveryDTOS.add(del10);
        deliveryDTOS.add(del11);
        deliveryDTOS.add(del12);
        deliveryDTOS.add(del13);
        deliveryDTOS.add(del14);
        deliveryDTOS.add(del15);

        return deliveryDTOS;
    }
    @Bean("getDepartments")
    public List<DepartmentDTO> getDepartments() {

        List<DepartmentDTO> departmentDTOS = new ArrayList<>();

        DepartmentDTO dept1  = new DepartmentDTO(1,  "HR",            25, "Raghav",     "hr@gmail.com",      "hr@123", 9876543210L, "Bengaluru");
        DepartmentDTO dept2  = new DepartmentDTO(2,  "Finance",       30, "Sowmya",     "finance@gmail.com", "fin@123", 9988776655L, "Mysuru");
        DepartmentDTO dept3  = new DepartmentDTO(3,  "IT",            50, "Anil",       "it@gmail.com",      "it@123",  7766554433L, "Hubballi");
        DepartmentDTO dept4  = new DepartmentDTO(4,  "Marketing",     20, "Priya",      "marketing@gmail.com","mar@123",9123456781L, "Shivamogga");
        DepartmentDTO dept5  = new DepartmentDTO(5,  "Sales",         35, "Vikram",     "sales@gmail.com",   "sal@123", 9090909090L, "Belagavi");
        DepartmentDTO dept6  = new DepartmentDTO(6,  "R&D",           40, "Divya",      "rnd@gmail.com",     "rnd@123", 9345678123L, "Tumakuru");
        DepartmentDTO dept7  = new DepartmentDTO(7,  "Support",       28, "Harish",     "support@gmail.com", "sup@123", 8090808080L, "Hassan");
        DepartmentDTO dept8  = new DepartmentDTO(8,  "Logistics",     32, "Kavya",      "logistics@gmail.com","log@123",9012345678L, "Mandya");
        DepartmentDTO dept9  = new DepartmentDTO(9,  "Operations",    45, "Rakesh",     "operations@gmail.com","op@123",9786543210L, "Udupi");
        DepartmentDTO dept10 = new DepartmentDTO(10, "Procurement",   22, "Anusha",     "procurement@gmail.com","proc@123",8899776655L,"Davangere");
        DepartmentDTO dept11 = new DepartmentDTO(11, "Legal",         15, "Manoj",      "legal@gmail.com",   "leg@123", 7766551122L, "Ballari");
        DepartmentDTO dept12 = new DepartmentDTO(12, "Quality",       18, "Swati",      "quality@gmail.com", "qual@123",9678543210L, "Raichur");
        DepartmentDTO dept13 = new DepartmentDTO(13, "Admin",         20, "Girish",     "admin@gmail.com",   "adm@123", 8877665544L, "Kalaburagi");
        DepartmentDTO dept14 = new DepartmentDTO(14, "Production",    38, "Sneha",      "production@gmail.com","prod@123",9034567812L, "Kolar");
        DepartmentDTO dept15 = new DepartmentDTO(15, "Design",        27, "Yogesh",     "design@gmail.com",  "des@123", 9445566778L, "Chikkamagaluru");

        departmentDTOS.add(dept1);
        departmentDTOS.add(dept2);
        departmentDTOS.add(dept3);
        departmentDTOS.add(dept4);
        departmentDTOS.add(dept5);
        departmentDTOS.add(dept6);
        departmentDTOS.add(dept7);
        departmentDTOS.add(dept8);
        departmentDTOS.add(dept9);
        departmentDTOS.add(dept10);
        departmentDTOS.add(dept11);
        departmentDTOS.add(dept12);
        departmentDTOS.add(dept13);
        departmentDTOS.add(dept14);
        departmentDTOS.add(dept15);

        return departmentDTOS;
    }
    @Bean("getDoctors")
    public List<DoctorDTO> getDoctors() {

        List<DoctorDTO> doctorDTOS = new ArrayList<>();

        DoctorDTO doc1  = new DoctorDTO(1,  "Dr. Ramesh",      10, "Cardiology",     "ramesh@gmail.com",    "ram@123", 9876543210L, "Bengaluru Heart Center");
        DoctorDTO doc2  = new DoctorDTO(2,  "Dr. Sowmya",      8,  "Dermatology",    "sowmya@gmail.com",    "sow@123", 9988776655L, "Mysuru Skin Clinic");
        DoctorDTO doc3  = new DoctorDTO(3,  "Dr. Anil",        15, "Neurology",      "anil@gmail.com",      "ani@123", 7766554433L, "Hubballi Neuro Care");
        DoctorDTO doc4  = new DoctorDTO(4,  "Dr. Priya",       7,  "Pediatrics",     "priya@gmail.com",     "pri@123", 9123456781L, "Shivamogga Children Hospital");
        DoctorDTO doc5  = new DoctorDTO(5,  "Dr. Vikram",      12, "Orthopedics",    "vikram@gmail.com",    "vik@123", 9090909090L, "Belagavi Ortho Clinic");
        DoctorDTO doc6  = new DoctorDTO(6,  "Dr. Divya",       9,  "Gynecology",     "divya@gmail.com",     "div@123", 9345678123L, "Tumakuru Women's Hospital");
        DoctorDTO doc7  = new DoctorDTO(7,  "Dr. Harish",      20, "Cardiology",     "harish@gmail.com",    "har@123", 8090808080L, "Hassan Heart Care");
        DoctorDTO doc8  = new DoctorDTO(8,  "Dr. Kavya",       6,  "Ophthalmology",  "kavya@gmail.com",     "kav@123", 9012345678L, "Mandya Eye Clinic");
        DoctorDTO doc9  = new DoctorDTO(9,  "Dr. Rakesh",      18, "ENT",            "rakesh@gmail.com",    "rak@123", 9786543210L, "Udupi ENT Center");
        DoctorDTO doc10 = new DoctorDTO(10, "Dr. Anusha",      5,  "Pediatrics",     "anusha@gmail.com",    "anu@123", 8899776655L, "Davangere Kids Care");
        DoctorDTO doc11 = new DoctorDTO(11, "Dr. Manoj",       14, "Orthopedics",    "manoj@gmail.com",     "man@123", 7766551122L, "Ballari Ortho Clinic");
        DoctorDTO doc12 = new DoctorDTO(12, "Dr. Swati",       11, "Gynecology",     "swati@gmail.com",     "swa@123", 9678543210L, "Raichur Women's Hospital");
        DoctorDTO doc13 = new DoctorDTO(13, "Dr. Girish",      16, "Neurology",      "girish@gmail.com",    "gir@123", 8877665544L, "Kalaburagi Neuro Care");
        DoctorDTO doc14 = new DoctorDTO(14, "Dr. Sneha",       7,  "Dermatology",    "sneha@gmail.com",     "sne@123", 9034567812L, "Kolar Skin Clinic");
        DoctorDTO doc15 = new DoctorDTO(15, "Dr. Yogesh",      19, "Cardiology",     "yogesh@gmail.com",    "yog@123", 9445566778L, "Chikkamagaluru Heart Center");

        doctorDTOS.add(doc1);
        doctorDTOS.add(doc2);
        doctorDTOS.add(doc3);
        doctorDTOS.add(doc4);
        doctorDTOS.add(doc5);
        doctorDTOS.add(doc6);
        doctorDTOS.add(doc7);
        doctorDTOS.add(doc8);
        doctorDTOS.add(doc9);
        doctorDTOS.add(doc10);
        doctorDTOS.add(doc11);
        doctorDTOS.add(doc12);
        doctorDTOS.add(doc13);
        doctorDTOS.add(doc14);
        doctorDTOS.add(doc15);

        return doctorDTOS;
    }
    @Bean("getEmployees")
    public List<EmployeeDTO> getEmployees() {

        List<EmployeeDTO> employeeDTOS = new ArrayList<>();

        EmployeeDTO emp1  = new EmployeeDTO(1,  "Thanushree",   22, "Female", "thanu@gmail.com",    "tanu@123", 9483526695L, "Sullia");
        EmployeeDTO emp2  = new EmployeeDTO(2,  "Yashaswini",   21, "Female", "yashu@gmail.com",    "yashu@123", 7783526695L, "Badhravathi");
        EmployeeDTO emp3  = new EmployeeDTO(3,  "Priya",        23, "Female", "priya23@gmail.com",  "priya@123", 9090909090L, "Mysuru");
        EmployeeDTO emp4  = new EmployeeDTO(4,  "Karthik",      27, "Male",   "karthik27@gmail.com","karthik@123", 9123456780L, "Tumakuru");
        EmployeeDTO emp5  = new EmployeeDTO(5,  "Sahana",       22, "Female", "sahana22@gmail.com", "sahana@123", 9988776655L, "Shimoga");
        EmployeeDTO emp6  = new EmployeeDTO(6,  "Manoj",        29, "Male",   "manoj@gmail.com",    "manoj@123", 9345678123L, "Chikkamagaluru");
        EmployeeDTO emp7  = new EmployeeDTO(7,  "Deepika",      24, "Female", "deepika24@gmail.com","deepika@123", 8090809080L, "Davangere");
        EmployeeDTO emp8  = new EmployeeDTO(8,  "Abhishek",     28, "Male",   "abhishek28@gmail.com","abhi@123", 9012345678L, "Udupi");
        EmployeeDTO emp9  = new EmployeeDTO(9,  "Lavanya",      26, "Female", "lavanya26@gmail.com","lav@123", 9786543210L, "Hassan");
        EmployeeDTO emp10 = new EmployeeDTO(10, "Sharath",      30, "Male",   "sharath30@gmail.com","sharath@123", 8899776655L, "Mandya");
        EmployeeDTO emp11 = new EmployeeDTO(11, "Nisha",        22, "Female", "nisha22@gmail.com", "nisha@123", 7766554433L, "Ballari");
        EmployeeDTO emp12 = new EmployeeDTO(12, "Varun",        24, "Male",   "varun24@gmail.com", "varun@123", 9678543210L, "Hubballi");
        EmployeeDTO emp13 = new EmployeeDTO(13, "Aishwarya",    25, "Female", "aishu@gmail.com",    "aishu@123", 8877665544L, "Belagavi");
        EmployeeDTO emp14 = new EmployeeDTO(14, "Rakesh",       28, "Male",   "rakesh@gmail.com",   "rakesh@123", 9034567812L, "Gadag");
        EmployeeDTO emp15 = new EmployeeDTO(15, "Sindhu",       23, "Female", "sindhu23@gmail.com", "sindhu@123", 9445566778L, "Raichur");

        employeeDTOS.add(emp1);
        employeeDTOS.add(emp2);
        employeeDTOS.add(emp3);
        employeeDTOS.add(emp4);
        employeeDTOS.add(emp5);
        employeeDTOS.add(emp6);
        employeeDTOS.add(emp7);
        employeeDTOS.add(emp8);
        employeeDTOS.add(emp9);
        employeeDTOS.add(emp10);
        employeeDTOS.add(emp11);
        employeeDTOS.add(emp12);
        employeeDTOS.add(emp13);
        employeeDTOS.add(emp14);
        employeeDTOS.add(emp15);

        return employeeDTOS;
    }
    @Bean("getFoods")
    public List<FoodDTO> getFoods() {

        List<FoodDTO> foodDTOS = new ArrayList<>();

        FoodDTO food1  = new FoodDTO(1,  "Pizza",          50, "Fast Food",    "pizza@gmail.com",    "piz@123", 9876543210L, "Bengaluru");
        FoodDTO food2  = new FoodDTO(2,  "Burger",         60, "Fast Food",    "burger@gmail.com",   "bur@123", 9988776655L, "Mysuru");
        FoodDTO food3  = new FoodDTO(3,  "Pasta",          40, "Italian",      "pasta@gmail.com",    "pas@123", 7766554433L, "Hubballi");
        FoodDTO food4  = new FoodDTO(4,  "Dosa",           30, "South Indian", "dosa@gmail.com",     "dos@123", 9123456781L, "Shivamogga");
        FoodDTO food5  = new FoodDTO(5,  "Idli",           25, "South Indian", "idli@gmail.com",     "idl@123", 9090909090L, "Belagavi");
        FoodDTO food6  = new FoodDTO(6,  "Sandwich",       35, "Fast Food",    "sandwich@gmail.com", "san@123", 9345678123L, "Tumakuru");
        FoodDTO food7  = new FoodDTO(7,  "Samosa",         45, "Snacks",       "samosa@gmail.com",   "sam@123", 8090808080L, "Hassan");
        FoodDTO food8  = new FoodDTO(8,  "Paneer Tikka",   20, "Indian",       "paneer@gmail.com",   "pan@123", 9012345678L, "Mandya");
        FoodDTO food9  = new FoodDTO(9,  "Biryani",        55, "Indian",       "biryani@gmail.com",  "bir@123", 9786543210L, "Udupi");
        FoodDTO food10 = new FoodDTO(10, "Sandesh",        15, "Dessert",      "sandesh@gmail.com",  "sde@123", 8899776655L, "Davangere");
        FoodDTO food11 = new FoodDTO(11, "Ladoo",          40, "Dessert",      "ladoo@gmail.com",    "lad@123", 7766551122L, "Ballari");
        FoodDTO food12 = new FoodDTO(12, "Chow Mein",      30, "Chinese",      "chowmein@gmail.com", "chow@123", 9678543210L, "Raichur");
        FoodDTO food13 = new FoodDTO(13, "Spring Roll",    25, "Chinese",      "spring@gmail.com",   "spr@123", 8877665544L, "Kalaburagi");
        FoodDTO food14 = new FoodDTO(14, "Paneer Butter Masala", 20, "Indian",   "pbm@gmail.com",     "pbm@123", 9034567812L, "Kolar");
        FoodDTO food15 = new FoodDTO(15, "Chocolate Cake", 10, "Dessert",      "cake@gmail.com",     "cak@123", 9445566778L, "Chikkamagaluru");

        foodDTOS.add(food1);
        foodDTOS.add(food2);
        foodDTOS.add(food3);
        foodDTOS.add(food4);
        foodDTOS.add(food5);
        foodDTOS.add(food6);
        foodDTOS.add(food7);
        foodDTOS.add(food8);
        foodDTOS.add(food9);
        foodDTOS.add(food10);
        foodDTOS.add(food11);
        foodDTOS.add(food12);
        foodDTOS.add(food13);
        foodDTOS.add(food14);
        foodDTOS.add(food15);

        return foodDTOS;
    }
    @Bean("getHotels")
    public List<HotelDTO> getHotels() {

        List<HotelDTO> hotelDTOS = new ArrayList<>();

        HotelDTO hotel1  = new HotelDTO(1,  "Grand Palace",       100, "Luxury",    "grand@gmail.com",   "grand@123", 9876543210L, "Bengaluru");
        HotelDTO hotel2  = new HotelDTO(2,  "Royal Inn",          80,  "Premium",   "royal@gmail.com",   "royal@123", 9988776655L, "Mysuru");
        HotelDTO hotel3  = new HotelDTO(3,  "Sunrise Residency",  60,  "Budget",    "sunrise@gmail.com","sun@123",   7766554433L, "Hubballi");
        HotelDTO hotel4  = new HotelDTO(4,  "Lotus Hotel",        50,  "Premium",   "lotus@gmail.com",  "lotus@123", 9123456781L, "Shivamogga");
        HotelDTO hotel5  = new HotelDTO(5,  "Blue Lagoon",        70,  "Luxury",    "blue@gmail.com",   "blue@123",  9090909090L, "Belagavi");
        HotelDTO hotel6  = new HotelDTO(6,  "Maple Stay",         65,  "Budget",    "maple@gmail.com",  "maple@123", 9345678123L, "Tumakuru");
        HotelDTO hotel7  = new HotelDTO(7,  "Crystal Inn",        90,  "Luxury",    "crystal@gmail.com","crys@123",  8090808080L, "Hassan");
        HotelDTO hotel8  = new HotelDTO(8,  "Pearl Residency",    55,  "Premium",   "pearl@gmail.com",  "pearl@123", 9012345678L, "Mandya");
        HotelDTO hotel9  = new HotelDTO(9,  "Emerald Suites",     80,  "Luxury",    "emerald@gmail.com","emer@123",  9786543210L, "Udupi");
        HotelDTO hotel10 = new HotelDTO(10, "Harmony Hotel",      75,  "Premium",   "harmony@gmail.com","harm@123",  8899776655L, "Davangere");
        HotelDTO hotel11 = new HotelDTO(11, "Sunset Inn",         50,  "Budget",    "sunset@gmail.com", "sunset@123",7766551122L, "Ballari");
        HotelDTO hotel12 = new HotelDTO(12, "Emerald Stay",       60,  "Luxury",    "emerald2@gmail.com","emer2@123",9678543210L, "Raichur");
        HotelDTO hotel13 = new HotelDTO(13, "Maple Residency",    55,  "Premium",   "maple2@gmail.com", "maple2@123",8877665544L, "Kalaburagi");
        HotelDTO hotel14 = new HotelDTO(14, "Blue Sky Hotel",     70,  "Luxury",    "bluesky@gmail.com", "blue@123", 9034567812L, "Kolar");
        HotelDTO hotel15 = new HotelDTO(15, "Golden Stay",        85,  "Premium",   "golden@gmail.com", "gold@123", 9445566778L, "Chikkamagaluru");

        hotelDTOS.add(hotel1);
        hotelDTOS.add(hotel2);
        hotelDTOS.add(hotel3);
        hotelDTOS.add(hotel4);
        hotelDTOS.add(hotel5);
        hotelDTOS.add(hotel6);
        hotelDTOS.add(hotel7);
        hotelDTOS.add(hotel8);
        hotelDTOS.add(hotel9);
        hotelDTOS.add(hotel10);
        hotelDTOS.add(hotel11);
        hotelDTOS.add(hotel12);
        hotelDTOS.add(hotel13);
        hotelDTOS.add(hotel14);
        hotelDTOS.add(hotel15);

        return hotelDTOS;
    }
    @Bean("getItems")
    public List<ItemDTO> getItems() {

        List<ItemDTO> itemDTOS = new ArrayList<>();

        ItemDTO item1  = new ItemDTO(1,  "Laptop",        50, "Electronics", "laptop@gmail.com", "lap@123", 9876543210L, "Bengaluru");
        ItemDTO item2  = new ItemDTO(2,  "Mobile Phone",  100, "Electronics", "mobile@gmail.com","mob@123", 9988776655L, "Mysuru");
        ItemDTO item3  = new ItemDTO(3,  "Table",         30, "Furniture",   "table@gmail.com", "tab@123", 7766554433L, "Hubballi");
        ItemDTO item4  = new ItemDTO(4,  "Chair",         40, "Furniture",   "chair@gmail.com", "cha@123", 9123456781L, "Shivamogga");
        ItemDTO item5  = new ItemDTO(5,  "Printer",       20, "Electronics", "printer@gmail.com","pri@123", 9090909090L, "Belagavi");
        ItemDTO item6  = new ItemDTO(6,  "Pen",           500, "Stationery", "pen@gmail.com",   "pen@123", 9345678123L, "Tumakuru");
        ItemDTO item7  = new ItemDTO(7,  "Notebook",      300, "Stationery", "notebook@gmail.com","note@123",8090808080L, "Hassan");
        ItemDTO item8  = new ItemDTO(8,  "Headphones",    60, "Electronics", "headphone@gmail.com","head@123",9012345678L, "Mandya");
        ItemDTO item9  = new ItemDTO(9,  "Sofa",          15, "Furniture",   "sofa@gmail.com", "sofa@123", 9786543210L, "Udupi");
        ItemDTO item10 = new ItemDTO(10, "Monitor",       25, "Electronics", "monitor@gmail.com","mon@123", 8899776655L, "Davangere");
        ItemDTO item11 = new ItemDTO(11, "Keyboard",      45, "Electronics", "keyboard@gmail.com","key@123", 7766551122L, "Ballari");
        ItemDTO item12 = new ItemDTO(12, "Mouse",         50, "Electronics", "mouse@gmail.com", "mou@123", 9678543210L, "Raichur");
        ItemDTO item13 = new ItemDTO(13, "Cupboard",      10, "Furniture",   "cupboard@gmail.com","cup@123", 8877665544L, "Kalaburagi");
        ItemDTO item14 = new ItemDTO(14, "Desk Lamp",     30, "Electronics", "lamps@gmail.com", "lamp@123", 9034567812L, "Kolar");
        ItemDTO item15 = new ItemDTO(15, "Backpack",      80, "Accessories", "bag@gmail.com", "bag@123", 9445566778L, "Chikkamagaluru");

        itemDTOS.add(item1);
        itemDTOS.add(item2);
        itemDTOS.add(item3);
        itemDTOS.add(item4);
        itemDTOS.add(item5);
        itemDTOS.add(item6);
        itemDTOS.add(item7);
        itemDTOS.add(item8);
        itemDTOS.add(item9);
        itemDTOS.add(item10);
        itemDTOS.add(item11);
        itemDTOS.add(item12);
        itemDTOS.add(item13);
        itemDTOS.add(item14);
        itemDTOS.add(item15);

        return itemDTOS;
    }
    @Bean("getLibraries")
    public List<LibraryDTO> getLibraries() {

        List<LibraryDTO> libraryDTOS = new ArrayList<>();

        LibraryDTO lib1  = new LibraryDTO(1,  "Central Library",   5000, "General",    "central@gmail.com", "cen@123", 9876543210L, "Bengaluru");
        LibraryDTO lib2  = new LibraryDTO(2,  "City Library",      3000, "Science",    "city@gmail.com",    "cit@123", 9988776655L, "Mysuru");
        LibraryDTO lib3  = new LibraryDTO(3,  "University Library",7000, "Academic",   "uni@gmail.com",     "uni@123", 7766554433L, "Hubballi");
        LibraryDTO lib4  = new LibraryDTO(4,  "Town Library",      2500, "Fiction",    "town@gmail.com",    "tow@123", 9123456781L, "Shivamogga");
        LibraryDTO lib5  = new LibraryDTO(5,  "Community Library", 3500, "Non-Fiction","community@gmail.com","com@123", 9090909090L, "Belagavi");
        LibraryDTO lib6  = new LibraryDTO(6,  "Children Library",  2000, "Kids",       "children@gmail.com","chi@123", 9345678123L, "Tumakuru");
        LibraryDTO lib7  = new LibraryDTO(7,  "Research Library",  6000, "Research",   "research@gmail.com","res@123", 8090808080L, "Hassan");
        LibraryDTO lib8  = new LibraryDTO(8,  "Digital Library",   4500, "E-Books",    "digital@gmail.com", "dig@123", 9012345678L, "Mandya");
        LibraryDTO lib9  = new LibraryDTO(9,  "National Library",  8000, "Reference",  "national@gmail.com","nat@123", 9786543210L, "Udupi");
        LibraryDTO lib10 = new LibraryDTO(10, "State Library",     4000, "History",    "state@gmail.com",   "sta@123", 8899776655L, "Davangere");
        LibraryDTO lib11 = new LibraryDTO(11, "Public Library",    3500, "General",    "public@gmail.com",  "pub@123", 7766551122L, "Ballari");
        LibraryDTO lib12 = new LibraryDTO(12, "College Library",   5000, "Academic",   "college@gmail.com", "col@123", 9678543210L, "Raichur");
        LibraryDTO lib13 = new LibraryDTO(13, "City Central Library",4500, "General",  "citycentral@gmail.com","cc@123",8877665544L,"Kalaburagi");
        LibraryDTO lib14 = new LibraryDTO(14, "Regional Library",  3000, "Fiction",    "regional@gmail.com","reg@123", 9034567812L, "Kolar");
        LibraryDTO lib15 = new LibraryDTO(15, "Community Knowledge Center",2500,"Knowledge","ckc@gmail.com","ckc@123",9445566778L,"Chikkamagaluru");

        libraryDTOS.add(lib1);
        libraryDTOS.add(lib2);
        libraryDTOS.add(lib3);
        libraryDTOS.add(lib4);
        libraryDTOS.add(lib5);
        libraryDTOS.add(lib6);
        libraryDTOS.add(lib7);
        libraryDTOS.add(lib8);
        libraryDTOS.add(lib9);
        libraryDTOS.add(lib10);
        libraryDTOS.add(lib11);
        libraryDTOS.add(lib12);
        libraryDTOS.add(lib13);
        libraryDTOS.add(lib14);
        libraryDTOS.add(lib15);

        return libraryDTOS;
    }
    @Bean("getLoans")
    public List<LoanDTO> getLoans() {

        List<LoanDTO> loanDTOS = new ArrayList<>();

        LoanDTO loan1  = new LoanDTO(1,  "Home Loan",         5000000, "Housing",  "home@gmail.com",  "home@123", 9876543210L, "Bengaluru Main Branch");
        LoanDTO loan2  = new LoanDTO(2,  "Car Loan",          1000000, "Vehicle",  "car@gmail.com",   "car@123",  9988776655L, "Mysuru Branch");
        LoanDTO loan3  = new LoanDTO(3,  "Education Loan",    1500000, "Education","edu@gmail.com",   "edu@123",  7766554433L, "Hubballi Branch");
        LoanDTO loan4  = new LoanDTO(4,  "Personal Loan",     500000,  "Personal", "personal@gmail.com","per@123",9123456781L, "Shivamogga Branch");
        LoanDTO loan5  = new LoanDTO(5,  "Gold Loan",         300000,  "Jewelry",  "gold@gmail.com",  "gold@123", 9090909090L, "Belagavi Branch");
        LoanDTO loan6  = new LoanDTO(6,  "Business Loan",     7000000, "Business","business@gmail.com","bus@123", 9345678123L, "Tumakuru Branch");
        LoanDTO loan7  = new LoanDTO(7,  "Agriculture Loan",  2000000, "Agriculture","agri@gmail.com","agr@123", 8090808080L, "Hassan Branch");
        LoanDTO loan8  = new LoanDTO(8,  "Housing Renovation",600000,  "Housing",  "reno@gmail.com", "ren@123", 9012345678L, "Mandya Branch");
        LoanDTO loan9  = new LoanDTO(9,  "Medical Loan",      400000,  "Medical",  "medical@gmail.com","med@123",9786543210L, "Udupi Branch");
        LoanDTO loan10 = new LoanDTO(10, "Travel Loan",       300000,  "Travel",   "travel@gmail.com","tra@123",  8899776655L, "Davangere Branch");
        LoanDTO loan11 = new LoanDTO(11, "Marriage Loan",     600000,  "Personal", "marriage@gmail.com","mar@123",7766551122L, "Ballari Branch");
        LoanDTO loan12 = new LoanDTO(12, "Vehicle Loan",      800000,  "Vehicle",  "vehicle@gmail.com","veh@123", 9678543210L, "Raichur Branch");
        LoanDTO loan13 = new LoanDTO(13, "Startup Loan",      10000000,"Business","startup@gmail.com","start@123",8877665544L, "Kalaburagi Branch");
        LoanDTO loan14 = new LoanDTO(14, "Education Loan",    1200000, "Education","edu2@gmail.com",  "edu2@123",9034567812L, "Kolar Branch");
        LoanDTO loan15 = new LoanDTO(15, "Home Loan",         5500000, "Housing",  "home2@gmail.com", "home2@123",9445566778L, "Chikkamagaluru Branch");

        loanDTOS.add(loan1);
        loanDTOS.add(loan2);
        loanDTOS.add(loan3);
        loanDTOS.add(loan4);
        loanDTOS.add(loan5);
        loanDTOS.add(loan6);
        loanDTOS.add(loan7);
        loanDTOS.add(loan8);
        loanDTOS.add(loan9);
        loanDTOS.add(loan10);
        loanDTOS.add(loan11);
        loanDTOS.add(loan12);
        loanDTOS.add(loan13);
        loanDTOS.add(loan14);
        loanDTOS.add(loan15);

        return loanDTOS;
    }
    @Bean("getManagers")
    public List<ManagerDTO> getManagers() {

        List<ManagerDTO> managerDTOS = new ArrayList<>();

        ManagerDTO man1  = new ManagerDTO(1,  "Raghav",     35, "Male",   "raghav@gmail.com", "rag@123", 9876543210L, "HR");
        ManagerDTO man2  = new ManagerDTO(2,  "Sowmya",     32, "Female", "sowmya@gmail.com", "sow@123", 9988776655L, "Finance");
        ManagerDTO man3  = new ManagerDTO(3,  "Anil",       40, "Male",   "anil@gmail.com",   "ani@123", 7766554433L, "IT");
        ManagerDTO man4  = new ManagerDTO(4,  "Priya",      30, "Female", "priya@gmail.com",  "pri@123", 9123456781L, "Marketing");
        ManagerDTO man5  = new ManagerDTO(5,  "Vikram",     38, "Male",   "vikram@gmail.com", "vik@123", 9090909090L, "Sales");
        ManagerDTO man6  = new ManagerDTO(6,  "Divya",      34, "Female", "divya@gmail.com",  "div@123", 9345678123L, "R&D");
        ManagerDTO man7  = new ManagerDTO(7,  "Harish",     36, "Male",   "harish@gmail.com", "har@123", 8090808080L, "Support");
        ManagerDTO man8  = new ManagerDTO(8,  "Kavya",      31, "Female", "kavya@gmail.com",  "kav@123", 9012345678L, "Logistics");
        ManagerDTO man9  = new ManagerDTO(9,  "Rakesh",     39, "Male",   "rakesh@gmail.com", "rak@123", 9786543210L, "Operations");
        ManagerDTO man10 = new ManagerDTO(10, "Anusha",     28, "Female", "anusha@gmail.com", "anu@123", 8899776655L, "Procurement");
        ManagerDTO man11 = new ManagerDTO(11, "Manoj",      37, "Male",   "manoj@gmail.com",  "man@123", 7766551122L, "Legal");
        ManagerDTO man12 = new ManagerDTO(12, "Swati",      33, "Female", "swati@gmail.com",  "swa@123", 9678543210L, "Quality");
        ManagerDTO man13 = new ManagerDTO(13, "Girish",     42, "Male",   "girish@gmail.com", "gir@123", 8877665544L, "Admin");
        ManagerDTO man14 = new ManagerDTO(14, "Sneha",      29, "Female", "sneha@gmail.com",  "sne@123", 9034567812L, "Production");
        ManagerDTO man15 = new ManagerDTO(15, "Yogesh",     41, "Male",   "yogesh@gmail.com", "yog@123", 9445566778L, "Design");

        managerDTOS.add(man1);
        managerDTOS.add(man2);
        managerDTOS.add(man3);
        managerDTOS.add(man4);
        managerDTOS.add(man5);
        managerDTOS.add(man6);
        managerDTOS.add(man7);
        managerDTOS.add(man8);
        managerDTOS.add(man9);
        managerDTOS.add(man10);
        managerDTOS.add(man11);
        managerDTOS.add(man12);
        managerDTOS.add(man13);
        managerDTOS.add(man14);
        managerDTOS.add(man15);

        return managerDTOS;
    }
    @Bean("getMovies")
    public List<MovieDTO> getMovies() {

        List<MovieDTO> movieDTOS = new ArrayList<>();

        MovieDTO movie1  = new MovieDTO(1,  "Inception",       148, "Sci-Fi",      "inception@gmail.com", "inc@123", 9876543210L, "English");
        MovieDTO movie2  = new MovieDTO(2,  "Interstellar",    169, "Sci-Fi",      "interstellar@gmail.com","int@123",9988776655L, "English");
        MovieDTO movie3  = new MovieDTO(3,  "Titanic",         195, "Romance",     "titanic@gmail.com",    "tit@123",7766554433L, "English");
        MovieDTO movie4  = new MovieDTO(4,  "3 Idiots",        170, "Comedy",      "3idiots@gmail.com",    "3id@123",9123456781L, "Hindi");
        MovieDTO movie5  = new MovieDTO(5,  "Bahubali",        159, "Action",      "bahubali@gmail.com",   "bah@123",9090909090L, "Telugu");
        MovieDTO movie6  = new MovieDTO(6,  "Avengers",        143, "Action",      "avengers@gmail.com",   "ave@123",9345678123L, "English");
        MovieDTO movie7  = new MovieDTO(7,  "Forrest Gump",    142, "Drama",       "forrest@gmail.com",    "for@123",8090808080L, "English");
        MovieDTO movie8  = new MovieDTO(8,  "Spider-Man",      130, "Action",      "spiderman@gmail.com",  "spi@123",9012345678L, "English");
        MovieDTO movie9  = new MovieDTO(9,  "Coco",            105, "Animation",   "coco@gmail.com",       "coc@123",9786543210L, "English");
        MovieDTO movie10 = new MovieDTO(10, "Frozen",         102, "Animation",   "frozen@gmail.com",     "fro@123",8899776655L, "English");
        MovieDTO movie11 = new MovieDTO(11, "Jawan",          165, "Action",      "jawan@gmail.com",      "jaw@123",7766551122L, "Hindi");
        MovieDTO movie12 = new MovieDTO(12, "KGF",            155, "Action",      "kgf@gmail.com",        "kgf@123",9678543210L, "Kannada");
        MovieDTO movie13 = new MovieDTO(13, "The Dark Knight",152, "Action",      "darkknight@gmail.com", "dk@123", 8877665544L, "English");
        MovieDTO movie14 = new MovieDTO(14, "Pushpa",         179, "Action",      "pushpa@gmail.com",     "pus@123",9034567812L, "Telugu");
        MovieDTO movie15 = new MovieDTO(15, "Avatar",         162, "Sci-Fi",      "avatar@gmail.com",     "ava@123",9445566778L, "English");

        movieDTOS.add(movie1);
        movieDTOS.add(movie2);
        movieDTOS.add(movie3);
        movieDTOS.add(movie4);
        movieDTOS.add(movie5);
        movieDTOS.add(movie6);
        movieDTOS.add(movie7);
        movieDTOS.add(movie8);
        movieDTOS.add(movie9);
        movieDTOS.add(movie10);
        movieDTOS.add(movie11);
        movieDTOS.add(movie12);
        movieDTOS.add(movie13);
        movieDTOS.add(movie14);
        movieDTOS.add(movie15);

        return movieDTOS;
    }
    @Bean("getOrders")
    public List<OrderDTO> getOrders() {

        List<OrderDTO> orderDTOS = new ArrayList<>();

        OrderDTO order1  = new OrderDTO(1,  "Laptop Order",        10, "Electronics", "laptop@gmail.com",    "lap@123", 9876543210L, "Bengaluru");
        OrderDTO order2  = new OrderDTO(2,  "Mobile Order",        20, "Electronics", "mobile@gmail.com",    "mob@123", 9988776655L, "Mysuru");
        OrderDTO order3  = new OrderDTO(3,  "Book Order",          50, "Books",       "book@gmail.com",      "book@123", 7766554433L, "Hubballi");
        OrderDTO order4  = new OrderDTO(4,  "Chair Order",         15, "Furniture",   "chair@gmail.com",     "cha@123", 9123456781L, "Shivamogga");
        OrderDTO order5  = new OrderDTO(5,  "Table Order",         10, "Furniture",   "table@gmail.com",     "tab@123", 9090909090L, "Belagavi");
        OrderDTO order6  = new OrderDTO(6,  "Pen Order",           100, "Stationery", "pen@gmail.com",       "pen@123", 9345678123L, "Tumakuru");
        OrderDTO order7  = new OrderDTO(7,  "Notebook Order",      70, "Stationery", "notebook@gmail.com",  "note@123", 8090808080L, "Hassan");
        OrderDTO order8  = new OrderDTO(8,  "Headphones Order",    30, "Electronics", "headphone@gmail.com","head@123", 9012345678L, "Mandya");
        OrderDTO order9  = new OrderDTO(9,  "Sofa Order",          5, "Furniture",   "sofa@gmail.com",      "sofa@123", 9786543210L, "Udupi");
        OrderDTO order10 = new OrderDTO(10, "Monitor Order",       12, "Electronics", "monitor@gmail.com",   "mon@123", 8899776655L, "Davangere");
        OrderDTO order11 = new OrderDTO(11, "Keyboard Order",      20, "Electronics", "keyboard@gmail.com",  "key@123", 7766551122L, "Ballari");
        OrderDTO order12 = new OrderDTO(12, "Mouse Order",         25, "Electronics", "mouse@gmail.com",     "mou@123", 9678543210L, "Raichur");
        OrderDTO order13 = new OrderDTO(13, "Cupboard Order",      8, "Furniture",   "cupboard@gmail.com",  "cup@123", 8877665544L, "Kalaburagi");
        OrderDTO order14 = new OrderDTO(14, "Desk Lamp Order",     18, "Electronics", "lamps@gmail.com",     "lamp@123", 9034567812L, "Kolar");
        OrderDTO order15 = new OrderDTO(15, "Backpack Order",      30, "Accessories", "bag@gmail.com",       "bag@123", 9445566778L, "Chikkamagaluru");

        orderDTOS.add(order1);
        orderDTOS.add(order2);
        orderDTOS.add(order3);
        orderDTOS.add(order4);
        orderDTOS.add(order5);
        orderDTOS.add(order6);
        orderDTOS.add(order7);
        orderDTOS.add(order8);
        orderDTOS.add(order9);
        orderDTOS.add(order10);
        orderDTOS.add(order11);
        orderDTOS.add(order12);
        orderDTOS.add(order13);
        orderDTOS.add(order14);
        orderDTOS.add(order15);

        return orderDTOS;
    }
    @Bean("getPatients")
    public List<PatientDTO> getPatients() {

        List<PatientDTO> patientDTOS = new ArrayList<>();

        PatientDTO p1  = new PatientDTO(1,  "Rahul",       25, "Male",   "rahul@gmail.com", "rah@123", 9876543210L, "Bengaluru");
        PatientDTO p2  = new PatientDTO(2,  "Sneha",       30, "Female", "sneha@gmail.com", "sne@123", 9988776655L, "Mysuru");
        PatientDTO p3  = new PatientDTO(3,  "Amit",        28, "Male",   "amit@gmail.com",  "ami@123", 7766554433L, "Hubballi");
        PatientDTO p4  = new PatientDTO(4,  "Priya",       32, "Female", "priya@gmail.com", "pri@123", 9123456781L, "Shivamogga");
        PatientDTO p5  = new PatientDTO(5,  "Vikram",      40, "Male",   "vikram@gmail.com","vik@123", 9090909090L, "Belagavi");
        PatientDTO p6  = new PatientDTO(6,  "Divya",       29, "Female", "divya@gmail.com", "div@123", 9345678123L, "Tumakuru");
        PatientDTO p7  = new PatientDTO(7,  "Manoj",       35, "Male",   "manoj@gmail.com", "man@123", 8090808080L, "Hassan");
        PatientDTO p8  = new PatientDTO(8,  "Kavya",       27, "Female", "kavya@gmail.com", "kav@123", 9012345678L, "Mandya");
        PatientDTO p9  = new PatientDTO(9,  "Rakesh",      38, "Male",   "rakesh@gmail.com","rak@123", 9786543210L, "Udupi");
        PatientDTO p10 = new PatientDTO(10, "Anusha",      31, "Female", "anusha@gmail.com","anu@123", 8899776655L, "Davangere");
        PatientDTO p11 = new PatientDTO(11, "Girish",      42, "Male",   "girish@gmail.com","gir@123", 7766551122L, "Ballari");
        PatientDTO p12 = new PatientDTO(12, "Swati",       26, "Female", "swati@gmail.com", "swa@123", 9678543210L, "Raichur");
        PatientDTO p13 = new PatientDTO(13, "Harish",      36, "Male",   "harish@gmail.com","har@123", 8877665544L, "Kalaburagi");
        PatientDTO p14 = new PatientDTO(14, "Sneha R",     28, "Female", "sneha.r@gmail.com","sne@124",9034567812L, "Kolar");
        PatientDTO p15 = new PatientDTO(15, "Yogesh",      39, "Male",   "yogesh@gmail.com","yog@123", 9445566778L, "Chikkamagaluru");

        patientDTOS.add(p1);
        patientDTOS.add(p2);
        patientDTOS.add(p3);
        patientDTOS.add(p4);
        patientDTOS.add(p5);
        patientDTOS.add(p6);
        patientDTOS.add(p7);
        patientDTOS.add(p8);
        patientDTOS.add(p9);
        patientDTOS.add(p10);
        patientDTOS.add(p11);
        patientDTOS.add(p12);
        patientDTOS.add(p13);
        patientDTOS.add(p14);
        patientDTOS.add(p15);

        return patientDTOS;
    }
    @Bean("getPayments")
    public List<PaymentDTO> getPayments() {

        List<PaymentDTO> paymentDTOS = new ArrayList<>();

        PaymentDTO pay1  = new PaymentDTO(1,  "Rahul",       5000,  "Credit Card", "rahul@gmail.com", "rah@123", 9876543210L, "Bengaluru");
        PaymentDTO pay2  = new PaymentDTO(2,  "Sneha",       3000,  "Debit Card",  "sneha@gmail.com", "sne@123", 9988776655L, "Mysuru");
        PaymentDTO pay3  = new PaymentDTO(3,  "Amit",        7000,  "UPI",         "amit@gmail.com",  "ami@123", 7766554433L, "Hubballi");
        PaymentDTO pay4  = new PaymentDTO(4,  "Priya",       2500,  "Cash",        "priya@gmail.com", "pri@123", 9123456781L, "Shivamogga");
        PaymentDTO pay5  = new PaymentDTO(5,  "Vikram",      10000, "Credit Card", "vikram@gmail.com","vik@123", 9090909090L, "Belagavi");
        PaymentDTO pay6  = new PaymentDTO(6,  "Divya",       4500,  "UPI",         "divya@gmail.com", "div@123", 9345678123L, "Tumakuru");
        PaymentDTO pay7  = new PaymentDTO(7,  "Manoj",       6000,  "Debit Card",  "manoj@gmail.com", "man@123", 8090808080L, "Hassan");
        PaymentDTO pay8  = new PaymentDTO(8,  "Kavya",       3500,  "Cash",        "kavya@gmail.com", "kav@123", 9012345678L, "Mandya");
        PaymentDTO pay9  = new PaymentDTO(9,  "Rakesh",      8000,  "Credit Card", "rakesh@gmail.com","rak@123", 9786543210L, "Udupi");
        PaymentDTO pay10 = new PaymentDTO(10, "Anusha",      2700,  "UPI",         "anusha@gmail.com","anu@123", 8899776655L, "Davangere");
        PaymentDTO pay11 = new PaymentDTO(11, "Girish",      9000,  "Debit Card",  "girish@gmail.com","gir@123", 7766551122L, "Ballari");
        PaymentDTO pay12 = new PaymentDTO(12, "Swati",       3200,  "Cash",        "swati@gmail.com", "swa@123", 9678543210L, "Raichur");
        PaymentDTO pay13 = new PaymentDTO(13, "Harish",      7500,  "UPI",         "harish@gmail.com","har@123", 8877665544L, "Kalaburagi");
        PaymentDTO pay14 = new PaymentDTO(14, "Sneha R",     4000,  "Credit Card", "sneha.r@gmail.com","sne@124",9034567812L, "Kolar");
        PaymentDTO pay15 = new PaymentDTO(15, "Yogesh",      6800,  "Debit Card",  "yogesh@gmail.com","yog@123", 9445566778L, "Chikkamagaluru");

        paymentDTOS.add(pay1);
        paymentDTOS.add(pay2);
        paymentDTOS.add(pay3);
        paymentDTOS.add(pay4);
        paymentDTOS.add(pay5);
        paymentDTOS.add(pay6);
        paymentDTOS.add(pay7);
        paymentDTOS.add(pay8);
        paymentDTOS.add(pay9);
        paymentDTOS.add(pay10);
        paymentDTOS.add(pay11);
        paymentDTOS.add(pay12);
        paymentDTOS.add(pay13);
        paymentDTOS.add(pay14);
        paymentDTOS.add(pay15);

        return paymentDTOS;
    }
    @Bean("getPersons")
    public List<PersonDTO> getPersons() {

        List<PersonDTO> personDTOS = new ArrayList<>();

        PersonDTO p1  = new PersonDTO(1,  "Rahul",       28, "Male",   "rahul@gmail.com", "rah@123", 9876543210L, "Bengaluru");
        PersonDTO p2  = new PersonDTO(2,  "Sneha",       25, "Female", "sneha@gmail.com", "sne@123", 9988776655L, "Mysuru");
        PersonDTO p3  = new PersonDTO(3,  "Amit",        30, "Male",   "amit@gmail.com",  "ami@123", 7766554433L, "Hubballi");
        PersonDTO p4  = new PersonDTO(4,  "Priya",       27, "Female", "priya@gmail.com", "pri@123", 9123456781L, "Shivamogga");
        PersonDTO p5  = new PersonDTO(5,  "Vikram",      35, "Male",   "vikram@gmail.com","vik@123", 9090909090L, "Belagavi");
        PersonDTO p6  = new PersonDTO(6,  "Divya",       26, "Female", "divya@gmail.com", "div@123", 9345678123L, "Tumakuru");
        PersonDTO p7  = new PersonDTO(7,  "Manoj",       32, "Male",   "manoj@gmail.com", "man@123", 8090808080L, "Hassan");
        PersonDTO p8  = new PersonDTO(8,  "Kavya",       24, "Female", "kavya@gmail.com", "kav@123", 9012345678L, "Mandya");
        PersonDTO p9  = new PersonDTO(9,  "Rakesh",      38, "Male",   "rakesh@gmail.com","rak@123", 9786543210L, "Udupi");
        PersonDTO p10 = new PersonDTO(10, "Anusha",      29, "Female", "anusha@gmail.com","anu@123", 8899776655L, "Davangere");
        PersonDTO p11 = new PersonDTO(11, "Girish",      40, "Male",   "girish@gmail.com","gir@123", 7766551122L, "Ballari");
        PersonDTO p12 = new PersonDTO(12, "Swati",       23, "Female", "swati@gmail.com", "swa@123", 9678543210L, "Raichur");
        PersonDTO p13 = new PersonDTO(13, "Harish",      36, "Male",   "harish@gmail.com","har@123", 8877665544L, "Kalaburagi");
        PersonDTO p14 = new PersonDTO(14, "Sneha R",     27, "Female", "sneha.r@gmail.com","sne@124",9034567812L, "Kolar");
        PersonDTO p15 = new PersonDTO(15, "Yogesh",      39, "Male",   "yogesh@gmail.com","yog@123", 9445566778L, "Chikkamagaluru");

        personDTOS.add(p1);
        personDTOS.add(p2);
        personDTOS.add(p3);
        personDTOS.add(p4);
        personDTOS.add(p5);
        personDTOS.add(p6);
        personDTOS.add(p7);
        personDTOS.add(p8);
        personDTOS.add(p9);
        personDTOS.add(p10);
        personDTOS.add(p11);
        personDTOS.add(p12);
        personDTOS.add(p13);
        personDTOS.add(p14);
        personDTOS.add(p15);

        return personDTOS;
    }
    @Bean("getProducts")
    public List<ProductDTO> getProducts() {

        List<ProductDTO> productDTOS = new ArrayList<>();

        ProductDTO prod1  = new ProductDTO(1,  "Laptop",        50, "Electronics", "supplier1@gmail.com", "LP1001", 9876543210L, "Bengaluru");
        ProductDTO prod2  = new ProductDTO(2,  "Mobile",        100,"Electronics", "supplier2@gmail.com", "MB1002", 9988776655L, "Mysuru");
        ProductDTO prod3  = new ProductDTO(3,  "Chair",         30, "Furniture",   "supplier3@gmail.com", "CH1003", 7766554433L, "Hubballi");
        ProductDTO prod4  = new ProductDTO(4,  "Table",         20, "Furniture",   "supplier4@gmail.com", "TB1004", 9123456781L, "Shivamogga");
        ProductDTO prod5  = new ProductDTO(5,  "Notebook",      200,"Stationery",  "supplier5@gmail.com", "NB1005", 9090909090L, "Belagavi");
        ProductDTO prod6  = new ProductDTO(6,  "Pen",           500,"Stationery",  "supplier6@gmail.com", "PN1006", 9345678123L, "Tumakuru");
        ProductDTO prod7  = new ProductDTO(7,  "Headphones",    40, "Electronics", "supplier7@gmail.com", "HP1007", 8090808080L, "Hassan");
        ProductDTO prod8  = new ProductDTO(8,  "Monitor",       25, "Electronics", "supplier8@gmail.com", "MN1008", 9012345678L, "Mandya");
        ProductDTO prod9  = new ProductDTO(9,  "Keyboard",      60, "Electronics", "supplier9@gmail.com", "KB1009", 9786543210L, "Udupi");
        ProductDTO prod10 = new ProductDTO(10, "Mouse",         70, "Electronics", "supplier10@gmail.com","MS1010", 8899776655L, "Davangere");
        ProductDTO prod11 = new ProductDTO(11, "Cupboard",      15, "Furniture",   "supplier11@gmail.com","CB1011", 7766551122L, "Ballari");
        ProductDTO prod12 = new ProductDTO(12, "Desk Lamp",     35, "Electronics", "supplier12@gmail.com","DL1012", 9678543210L, "Raichur");
        ProductDTO prod13 = new ProductDTO(13, "Backpack",      80, "Accessories", "supplier13@gmail.com","BP1013", 8877665544L, "Kalaburagi");
        ProductDTO prod14 = new ProductDTO(14, "Water Bottle",  120,"Accessories", "supplier14@gmail.com","WB1014", 9034567812L, "Kolar");
        ProductDTO prod15 = new ProductDTO(15, "Smartwatch",    45, "Electronics", "supplier15@gmail.com","SW1015", 9445566778L, "Chikkamagaluru");

        productDTOS.add(prod1);
        productDTOS.add(prod2);
        productDTOS.add(prod3);
        productDTOS.add(prod4);
        productDTOS.add(prod5);
        productDTOS.add(prod6);
        productDTOS.add(prod7);
        productDTOS.add(prod8);
        productDTOS.add(prod9);
        productDTOS.add(prod10);
        productDTOS.add(prod11);
        productDTOS.add(prod12);
        productDTOS.add(prod13);
        productDTOS.add(prod14);
        productDTOS.add(prod15);

        return productDTOS;
    }
    @Bean("getRestaurants")
    public List<RestaurantDTO> getRestaurants() {

        List<RestaurantDTO> restaurantDTOS = new ArrayList<>();

        RestaurantDTO r1  = new RestaurantDTO(1,  "Spice Villa",       100, "Indian",     "spicevilla@gmail.com", "spice@123", 9876543210L, "Bengaluru");
        RestaurantDTO r2  = new RestaurantDTO(2,  "Ocean Delight",     80,  "Seafood",    "oceandelight@gmail.com","ocean@123",9988776655L, "Mysuru");
        RestaurantDTO r3  = new RestaurantDTO(3,  "Burger Hub",        120, "Fast Food",  "burgerhub@gmail.com",  "burger@123",7766554433L, "Hubballi");
        RestaurantDTO r4  = new RestaurantDTO(4,  "Pasta Palace",      70,  "Italian",    "pastapalace@gmail.com","pasta@123",9123456781L, "Shivamogga");
        RestaurantDTO r5  = new RestaurantDTO(5,  "Sushi World",       60,  "Japanese",   "sushiworld@gmail.com", "sushi@123",9090909090L, "Belagavi");
        RestaurantDTO r6  = new RestaurantDTO(6,  "Curry Corner",      90,  "Indian",     "currycorner@gmail.com","curry@123",9345678123L, "Tumakuru");
        RestaurantDTO r7  = new RestaurantDTO(7,  "Taco Town",         50,  "Mexican",    "tacotown@gmail.com",  "taco@123", 8090808080L, "Hassan");
        RestaurantDTO r8  = new RestaurantDTO(8,  "Noodle House",      110, "Chinese",    "noodlehouse@gmail.com","noodle@123",9012345678L, "Mandya");
        RestaurantDTO r9  = new RestaurantDTO(9,  "Grill Master",      85,  "BBQ",        "grillmaster@gmail.com","grill@123",9786543210L, "Udupi");
        RestaurantDTO r10 = new RestaurantDTO(10, "Veggie Delight",    95,  "Vegetarian", "veggiedelight@gmail.com","veggie@123",8899776655L, "Davangere");
        RestaurantDTO r11 = new RestaurantDTO(11, "Steak House",       75,  "American",   "steakhouse@gmail.com", "steak@123",7766551122L, "Ballari");
        RestaurantDTO r12 = new RestaurantDTO(12, "Pizza Planet",      100, "Italian",    "pizzaplanet@gmail.com","pizza@123",9678543210L, "Raichur");
        RestaurantDTO r13 = new RestaurantDTO(13, "Biryani Bistro",    90,  "Indian",     "biryani@gmail.com",   "biry@123", 8877665544L, "Kalaburagi");
        RestaurantDTO r14 = new RestaurantDTO(14, "Sea Breeze",        80,  "Seafood",    "seabreeze@gmail.com", "sea@123", 9034567812L, "Kolar");
        RestaurantDTO r15 = new RestaurantDTO(15, "Sweet Tooth",       60,  "Dessert",    "sweettooth@gmail.com","sweet@123",9445566778L, "Chikkamagaluru");

        restaurantDTOS.add(r1);
        restaurantDTOS.add(r2);
        restaurantDTOS.add(r3);
        restaurantDTOS.add(r4);
        restaurantDTOS.add(r5);
        restaurantDTOS.add(r6);
        restaurantDTOS.add(r7);
        restaurantDTOS.add(r8);
        restaurantDTOS.add(r9);
        restaurantDTOS.add(r10);
        restaurantDTOS.add(r11);
        restaurantDTOS.add(r12);
        restaurantDTOS.add(r13);
        restaurantDTOS.add(r14);
        restaurantDTOS.add(r15);

        return restaurantDTOS;
    }
    @Bean("getRooms")
    public List<RoomDTO> getRooms() {

        List<RoomDTO> roomDTOS = new ArrayList<>();

        RoomDTO room1  = new RoomDTO(1,  "Sunrise",       2, "Single",  "sunrise@gmail.com", "sun@123", 9876543210L, "A");
        RoomDTO room2  = new RoomDTO(2,  "Sunset",        4, "Double",  "sunset@gmail.com",  "set@123", 9988776655L, "B");
        RoomDTO room3  = new RoomDTO(3,  "Moonlight",     3, "Single",  "moonlight@gmail.com","moon@123",7766554433L, "C");
        RoomDTO room4  = new RoomDTO(4,  "Starlight",     5, "Suite",   "starlight@gmail.com","star@123",9123456781L, "D");
        RoomDTO room5  = new RoomDTO(5,  "Aurora",        2, "Single",  "aurora@gmail.com", "aur@123", 9090909090L, "E");
        RoomDTO room6  = new RoomDTO(6,  "Galaxy",        6, "Suite",   "galaxy@gmail.com", "gal@123", 9345678123L, "F");
        RoomDTO room7  = new RoomDTO(7,  "Comet",         3, "Double",  "comet@gmail.com",  "com@123", 8090808080L, "G");
        RoomDTO room8  = new RoomDTO(8,  "Meteor",        4, "Double",  "meteor@gmail.com", "met@123", 9012345678L, "H");
        RoomDTO room9  = new RoomDTO(9,  "Nebula",        5, "Suite",   "nebula@gmail.com", "neb@123", 9786543210L, "I");
        RoomDTO room10 = new RoomDTO(10, "Orion",        2, "Single",  "orion@gmail.com",  "ori@123", 8899776655L, "J");
        RoomDTO room11 = new RoomDTO(11, "Pegasus",      3, "Double",  "pegasus@gmail.com","peg@123", 7766551122L, "K");
        RoomDTO room12 = new RoomDTO(12, "Phoenix",      4, "Suite",   "phoenix@gmail.com","pho@123", 9678543210L, "L");
        RoomDTO room13 = new RoomDTO(13, "Auriga",       2, "Single",  "auriga@gmail.com", "aurg@123",8877665544L, "M");
        RoomDTO room14 = new RoomDTO(14, "Lyra",         5, "Suite",   "lyra@gmail.com",   "lyr@123", 9034567812L, "N");
        RoomDTO room15 = new RoomDTO(15, "Andromeda",    6, "Suite",   "andromeda@gmail.com","and@123",9445566778L, "O");

        roomDTOS.add(room1);
        roomDTOS.add(room2);
        roomDTOS.add(room3);
        roomDTOS.add(room4);
        roomDTOS.add(room5);
        roomDTOS.add(room6);
        roomDTOS.add(room7);
        roomDTOS.add(room8);
        roomDTOS.add(room9);
        roomDTOS.add(room10);
        roomDTOS.add(room11);
        roomDTOS.add(room12);
        roomDTOS.add(room13);
        roomDTOS.add(room14);
        roomDTOS.add(room15);

        return roomDTOS;
    }
    @Bean("getSellers")
    public List<SellerDTO> getSellers() {

        List<SellerDTO> sellerDTOS = new ArrayList<>();

        SellerDTO s1  = new SellerDTO(1,  "Rahul Traders",       5, "Electronics", "rahultraders@gmail.com", "rah@123", 9876543210L, "Bengaluru");
        SellerDTO s2  = new SellerDTO(2,  "Sneha Store",         4, "Fashion",     "snehastore@gmail.com",   "sne@123", 9988776655L, "Mysuru");
        SellerDTO s3  = new SellerDTO(3,  "Amit Mart",           3, "Groceries",   "amitmart@gmail.com",     "ami@123", 7766554433L, "Hubballi");
        SellerDTO s4  = new SellerDTO(4,  "Priya Emporium",      5, "Clothing",    "priyaemporium@gmail.com","pri@123", 9123456781L, "Shivamogga");
        SellerDTO s5  = new SellerDTO(5,  "Vikram Electronics",  4, "Electronics", "vikramelect@gmail.com",  "vik@123", 9090909090L, "Belagavi");
        SellerDTO s6  = new SellerDTO(6,  "Divya Decor",         5, "Home Decor",  "divyadecor@gmail.com",   "div@123", 9345678123L, "Tumakuru");
        SellerDTO s7  = new SellerDTO(7,  "Manoj Supplies",      3, "Groceries",   "manojsupplies@gmail.com","man@123", 8090808080L, "Hassan");
        SellerDTO s8  = new SellerDTO(8,  "Kavya Fashion",       4, "Clothing",    "kavyafashion@gmail.com","kav@123", 9012345678L, "Mandya");
        SellerDTO s9  = new SellerDTO(9,  "Rakesh Electronics",  5, "Electronics", "rakeshelect@gmail.com", "rak@123", 9786543210L, "Udupi");
        SellerDTO s10 = new SellerDTO(10, "Anusha Grocers",      4, "Groceries",   "anushagrocers@gmail.com","anu@123", 8899776655L, "Davangere");
        SellerDTO s11 = new SellerDTO(11, "Girish Furnitures",   3, "Furniture",   "girishfurn@gmail.com",  "gir@123", 7766551122L, "Ballari");
        SellerDTO s12 = new SellerDTO(12, "Swati Decor",         5, "Home Decor",  "swatidecor@gmail.com",   "swa@123", 9678543210L, "Raichur");
        SellerDTO s13 = new SellerDTO(13, "Harish Electronics",  4, "Electronics", "harishelect@gmail.com", "har@123", 8877665544L, "Kalaburagi");
        SellerDTO s14 = new SellerDTO(14, "Sneha R Fashion",     5, "Clothing",    "sneharfashion@gmail.com","sne@124",9034567812L, "Kolar");
        SellerDTO s15 = new SellerDTO(15, "Yogesh Grocers",      3, "Groceries",   "yogeshgrocers@gmail.com","yog@123",9445566778L, "Chikkamagaluru");

        sellerDTOS.add(s1);
        sellerDTOS.add(s2);
        sellerDTOS.add(s3);
        sellerDTOS.add(s4);
        sellerDTOS.add(s5);
        sellerDTOS.add(s6);
        sellerDTOS.add(s7);
        sellerDTOS.add(s8);
        sellerDTOS.add(s9);
        sellerDTOS.add(s10);
        sellerDTOS.add(s11);
        sellerDTOS.add(s12);
        sellerDTOS.add(s13);
        sellerDTOS.add(s14);
        sellerDTOS.add(s15);

        return sellerDTOS;
    }
    @Bean("getShops")
    public List<ShopDTO> getShops() {

        List<ShopDTO> shopDTOS = new ArrayList<>();

        ShopDTO shop1  = new ShopDTO(1,  "Rahul Mart",        10, "Grocery",    "rahulmart@gmail.com", "rah@123", 9876543210L, "Bengaluru");
        ShopDTO shop2  = new ShopDTO(2,  "Sneha Boutique",     5, "Clothing",  "snehaboutique@gmail.com","sne@123", 9988776655L, "Mysuru");
        ShopDTO shop3  = new ShopDTO(3,  "Amit Electronics",   8, "Electronics","amitelectronics@gmail.com","ami@123",7766554433L, "Hubballi");
        ShopDTO shop4  = new ShopDTO(4,  "Priya Stationery",   6, "Stationery","priyastationery@gmail.com","pri@123",9123456781L, "Shivamogga");
        ShopDTO shop5  = new ShopDTO(5,  "Vikram Furnitures", 12, "Furniture", "vikramfurnitures@gmail.com","vik@123",9090909090L, "Belagavi");
        ShopDTO shop6  = new ShopDTO(6,  "Divya Decor",        4, "Home Decor","divyadecor@gmail.com","div@123",9345678123L, "Tumakuru");
        ShopDTO shop7  = new ShopDTO(7,  "Manoj Grocers",      7, "Grocery",   "manoegrocers@gmail.com","man@123",8090808080L, "Hassan");
        ShopDTO shop8  = new ShopDTO(8,  "Kavya Fashion",      5, "Clothing",  "kavyafashion@gmail.com","kav@123",9012345678L, "Mandya");
        ShopDTO shop9  = new ShopDTO(9,  "Rakesh Electronics", 9, "Electronics","rakeshelectronics@gmail.com","rak@123",9786543210L, "Udupi");
        ShopDTO shop10 = new ShopDTO(10, "Anusha Grocers",     6, "Grocery",   "anushagrocers@gmail.com","anu@123",8899776655L, "Davangere");
        ShopDTO shop11 = new ShopDTO(11, "Girish Furnitures",  11, "Furniture","girishfurnitures@gmail.com","gir@123",7766551122L, "Ballari");
        ShopDTO shop12 = new ShopDTO(12, "Swati Decor",        4, "Home Decor","swatidecor@gmail.com","swa@123",9678543210L, "Raichur");
        ShopDTO shop13 = new ShopDTO(13, "Harish Electronics", 8, "Electronics","harishelectronics@gmail.com","har@123",8877665544L, "Kalaburagi");
        ShopDTO shop14 = new ShopDTO(14, "Sneha R Fashion",    5, "Clothing",  "sneharfashion@gmail.com","sne@124",9034567812L, "Kolar");
        ShopDTO shop15 = new ShopDTO(15, "Yogesh Grocers",     7, "Grocery",   "yogeshgrocers@gmail.com","yog@123",9445566778L, "Chikkamagaluru");

        shopDTOS.add(shop1);
        shopDTOS.add(shop2);
        shopDTOS.add(shop3);
        shopDTOS.add(shop4);
        shopDTOS.add(shop5);
        shopDTOS.add(shop6);
        shopDTOS.add(shop7);
        shopDTOS.add(shop8);
        shopDTOS.add(shop9);
        shopDTOS.add(shop10);
        shopDTOS.add(shop11);
        shopDTOS.add(shop12);
        shopDTOS.add(shop13);
        shopDTOS.add(shop14);
        shopDTOS.add(shop15);

        return shopDTOS;
    }
    @Bean("getStudents")
    public List<StudentDTO> getStudents() {

        List<StudentDTO> studentDTOS = new ArrayList<>();

        StudentDTO s1  = new StudentDTO(1,  "Rahul",       20, "Male",   "rahul@gmail.com", "rah@123", 9876543210L, "Bengaluru");
        StudentDTO s2  = new StudentDTO(2,  "Sneha",       19, "Female", "sneha@gmail.com", "sne@123", 9988776655L, "Mysuru");
        StudentDTO s3  = new StudentDTO(3,  "Amit",        21, "Male",   "amit@gmail.com",  "ami@123", 7766554433L, "Hubballi");
        StudentDTO s4  = new StudentDTO(4,  "Priya",       22, "Female", "priya@gmail.com", "pri@123", 9123456781L, "Shivamogga");
        StudentDTO s5  = new StudentDTO(5,  "Vikram",      23, "Male",   "vikram@gmail.com","vik@123", 9090909090L, "Belagavi");
        StudentDTO s6  = new StudentDTO(6,  "Divya",       20, "Female", "divya@gmail.com", "div@123", 9345678123L, "Tumakuru");
        StudentDTO s7  = new StudentDTO(7,  "Manoj",       24, "Male",   "manoj@gmail.com", "man@123", 8090808080L, "Hassan");
        StudentDTO s8  = new StudentDTO(8,  "Kavya",       21, "Female", "kavya@gmail.com", "kav@123", 9012345678L, "Mandya");
        StudentDTO s9  = new StudentDTO(9,  "Rakesh",      25, "Male",   "rakesh@gmail.com","rak@123", 9786543210L, "Udupi");
        StudentDTO s10 = new StudentDTO(10, "Anusha",      22, "Female", "anusha@gmail.com","anu@123", 8899776655L, "Davangere");
        StudentDTO s11 = new StudentDTO(11, "Girish",      23, "Male",   "girish@gmail.com","gir@123", 7766551122L, "Ballari");
        StudentDTO s12 = new StudentDTO(12, "Swati",       20, "Female", "swati@gmail.com", "swa@123", 9678543210L, "Raichur");
        StudentDTO s13 = new StudentDTO(13, "Harish",      24, "Male",   "harish@gmail.com","har@123", 8877665544L, "Kalaburagi");
        StudentDTO s14 = new StudentDTO(14, "Sneha R",     21, "Female", "sneha.r@gmail.com","sne@124",9034567812L, "Kolar");
        StudentDTO s15 = new StudentDTO(15, "Yogesh",      25, "Male",   "yogesh@gmail.com","yog@123", 9445566778L, "Chikkamagaluru");

        studentDTOS.add(s1);
        studentDTOS.add(s2);
        studentDTOS.add(s3);
        studentDTOS.add(s4);
        studentDTOS.add(s5);
        studentDTOS.add(s6);
        studentDTOS.add(s7);
        studentDTOS.add(s8);
        studentDTOS.add(s9);
        studentDTOS.add(s10);
        studentDTOS.add(s11);
        studentDTOS.add(s12);
        studentDTOS.add(s13);
        studentDTOS.add(s14);
        studentDTOS.add(s15);

        return studentDTOS;
    }
    @Bean("getTeachers")
    public List<TeacherDTO> getTeachers() {

        List<TeacherDTO> teacherDTOS = new ArrayList<>();

        TeacherDTO t1  = new TeacherDTO(1,  "Rahul Sharma",     35, "Male",   "rahul@gmail.com",   "rah@123", 9876543210L, "Math");
        TeacherDTO t2  = new TeacherDTO(2,  "Sneha Reddy",      30, "Female", "sneha@gmail.com",   "sne@123", 9988776655L, "English");
        TeacherDTO t3  = new TeacherDTO(3,  "Amit Kumar",       40, "Male",   "amit@gmail.com",    "ami@123", 7766554433L, "Physics");
        TeacherDTO t4  = new TeacherDTO(4,  "Priya Sharma",     32, "Female", "priya@gmail.com",   "pri@123", 9123456781L, "Chemistry");
        TeacherDTO t5  = new TeacherDTO(5,  "Vikram Singh",     38, "Male",   "vikram@gmail.com",  "vik@123", 9090909090L, "Biology");
        TeacherDTO t6  = new TeacherDTO(6,  "Divya Patel",      29, "Female", "divya@gmail.com",   "div@123", 9345678123L, "History");
        TeacherDTO t7  = new TeacherDTO(7,  "Manoj Reddy",      42, "Male",   "manoj@gmail.com",   "man@123", 8090808080L, "Geography");
        TeacherDTO t8  = new TeacherDTO(8,  "Kavya Sharma",     31, "Female", "kavya@gmail.com",   "kav@123", 9012345678L, "Computer Science");
        TeacherDTO t9  = new TeacherDTO(9,  "Rakesh Kumar",     36, "Male",   "rakesh@gmail.com",  "rak@123", 9786543210L, "Economics");
        TeacherDTO t10 = new TeacherDTO(10, "Anusha Reddy",     28, "Female", "anusha@gmail.com",  "anu@123", 8899776655L, "Political Science");
        TeacherDTO t11 = new TeacherDTO(11, "Girish Sharma",    45, "Male",   "girish@gmail.com",  "gir@123", 7766551122L, "Math");
        TeacherDTO t12 = new TeacherDTO(12, "Swati Patel",      33, "Female", "swati@gmail.com",   "swa@123", 9678543210L, "English");
        TeacherDTO t13 = new TeacherDTO(13, "Harish Kumar",     39, "Male",   "harish@gmail.com",  "har@123", 8877665544L, "Physics");
        TeacherDTO t14 = new TeacherDTO(14, "Sneha R Sharma",   30, "Female", "sneha.r@gmail.com", "sne@124", 9034567812L, "Chemistry");
        TeacherDTO t15 = new TeacherDTO(15, "Yogesh Singh",     41, "Male",   "yogesh@gmail.com",  "yog@123", 9445566778L, "Biology");

        teacherDTOS.add(t1);
        teacherDTOS.add(t2);
        teacherDTOS.add(t3);
        teacherDTOS.add(t4);
        teacherDTOS.add(t5);
        teacherDTOS.add(t6);
        teacherDTOS.add(t7);
        teacherDTOS.add(t8);
        teacherDTOS.add(t9);
        teacherDTOS.add(t10);
        teacherDTOS.add(t11);
        teacherDTOS.add(t12);
        teacherDTOS.add(t13);
        teacherDTOS.add(t14);
        teacherDTOS.add(t15);

        return teacherDTOS;
    }
    @Bean("getTickets")
    public List<TicketDTO> getTickets() {

        List<TicketDTO> ticketDTOS = new ArrayList<>();

        TicketDTO t1  = new TicketDTO(1,  "Movie A",       150, "Movie",     "moviea@gmail.com", "mov@123", 9876543210L, "Counter 1");
        TicketDTO t2  = new TicketDTO(2,  "Movie B",       200, "Movie",     "movieb@gmail.com", "mov@124", 9988776655L, "Counter 2");
        TicketDTO t3  = new TicketDTO(3,  "Concert X",     500, "Concert",   "concertx@gmail.com", "con@123", 7766554433L, "Counter 3");
        TicketDTO t4  = new TicketDTO(4,  "Concert Y",     450, "Concert",   "concerty@gmail.com", "con@124", 9123456781L, "Counter 4");
        TicketDTO t5  = new TicketDTO(5,  "Train 101",     300, "Train",     "train101@gmail.com", "tra@123", 9090909090L, "Counter 5");
        TicketDTO t6  = new TicketDTO(6,  "Train 102",     350, "Train",     "train102@gmail.com", "tra@124", 9345678123L, "Counter 6");
        TicketDTO t7  = new TicketDTO(7,  "Bus A",         50,  "Bus",       "busa@gmail.com", "bus@123", 8090808080L, "Counter 7");
        TicketDTO t8  = new TicketDTO(8,  "Bus B",         60,  "Bus",       "busb@gmail.com", "bus@124", 9012345678L, "Counter 8");
        TicketDTO t9  = new TicketDTO(9,  "Flight 101",    5000,"Flight",    "flight101@gmail.com", "fli@123", 9786543210L, "Counter 9");
        TicketDTO t10 = new TicketDTO(10, "Flight 102",    5500,"Flight",    "flight102@gmail.com","fli@124", 8899776655L, "Counter 10");
        TicketDTO t11 = new TicketDTO(11, "Event A",       1000,"Event",     "eventa@gmail.com", "eve@123", 7766551122L, "Counter 11");
        TicketDTO t12 = new TicketDTO(12, "Event B",       1200,"Event",     "eventb@gmail.com", "eve@124", 9678543210L, "Counter 12");
        TicketDTO t13 = new TicketDTO(13, "Show X",        800, "Show",      "showx@gmail.com", "sho@123", 8877665544L, "Counter 13");
        TicketDTO t14 = new TicketDTO(14, "Show Y",        900, "Show",      "showy@gmail.com", "sho@124", 9034567812L, "Counter 14");
        TicketDTO t15 = new TicketDTO(15, "Match 1",       1500,"Sports",    "match1@gmail.com", "mat@123", 9445566778L, "Counter 15");

        ticketDTOS.add(t1);
        ticketDTOS.add(t2);
        ticketDTOS.add(t3);
        ticketDTOS.add(t4);
        ticketDTOS.add(t5);
        ticketDTOS.add(t6);
        ticketDTOS.add(t7);
        ticketDTOS.add(t8);
        ticketDTOS.add(t9);
        ticketDTOS.add(t10);
        ticketDTOS.add(t11);
        ticketDTOS.add(t12);
        ticketDTOS.add(t13);
        ticketDTOS.add(t14);
        ticketDTOS.add(t15);

        return ticketDTOS;
    }
    @Bean("getTrainers")
    public List<TrainerDTO> getTrainers() {

        List<TrainerDTO> trainerDTOS = new ArrayList<>();

        TrainerDTO t1  = new TrainerDTO(1,  "Rahul Sharma",     5, "Java",           "rahul@gmail.com",   "rah@123", 9876543210L, "Bengaluru");
        TrainerDTO t2  = new TrainerDTO(2,  "Sneha Reddy",      3, "Python",         "sneha@gmail.com",   "sne@123", 9988776655L, "Mysuru");
        TrainerDTO t3  = new TrainerDTO(3,  "Amit Kumar",       7, "Data Science",   "amit@gmail.com",    "ami@123", 7766554433L, "Hubballi");
        TrainerDTO t4  = new TrainerDTO(4,  "Priya Sharma",     4, "AWS",            "priya@gmail.com",   "pri@123", 9123456781L, "Shivamogga");
        TrainerDTO t5  = new TrainerDTO(5,  "Vikram Singh",     6, "DevOps",         "vikram@gmail.com",  "vik@123", 9090909090L, "Belagavi");
        TrainerDTO t6  = new TrainerDTO(6,  "Divya Patel",      5, "UI/UX",          "divya@gmail.com",   "div@123", 9345678123L, "Tumakuru");
        TrainerDTO t7  = new TrainerDTO(7,  "Manoj Reddy",      8, "Cybersecurity",  "manoj@gmail.com",   "man@123", 8090808080L, "Hassan");
        TrainerDTO t8  = new TrainerDTO(8,  "Kavya Sharma",     3, "Python",         "kavya@gmail.com",   "kav@123", 9012345678L, "Mandya");
        TrainerDTO t9  = new TrainerDTO(9,  "Rakesh Kumar",     6, "Java",           "rakesh@gmail.com",  "rak@123", 9786543210L, "Udupi");
        TrainerDTO t10 = new TrainerDTO(10, "Anusha Reddy",     4, "Data Science",   "anusha@gmail.com",  "anu@123", 8899776655L, "Davangere");
        TrainerDTO t11 = new TrainerDTO(11, "Girish Sharma",    7, "DevOps",         "girish@gmail.com",  "gir@123", 7766551122L, "Ballari");
        TrainerDTO t12 = new TrainerDTO(12, "Swati Patel",      5, "AWS",            "swati@gmail.com",   "swa@123", 9678543210L, "Raichur");
        TrainerDTO t13 = new TrainerDTO(13, "Harish Kumar",     6, "UI/UX",          "harish@gmail.com",  "har@123", 8877665544L, "Kalaburagi");
        TrainerDTO t14 = new TrainerDTO(14, "Sneha R Sharma",   4, "Python",         "sneha.r@gmail.com", "sne@124",9034567812L, "Kolar");
        TrainerDTO t15 = new TrainerDTO(15, "Yogesh Singh",     8, "Cybersecurity",  "yogesh@gmail.com",  "yog@123", 9445566778L, "Chikkamagaluru");

        trainerDTOS.add(t1);
        trainerDTOS.add(t2);
        trainerDTOS.add(t3);
        trainerDTOS.add(t4);
        trainerDTOS.add(t5);
        trainerDTOS.add(t6);
        trainerDTOS.add(t7);
        trainerDTOS.add(t8);
        trainerDTOS.add(t9);
        trainerDTOS.add(t10);
        trainerDTOS.add(t11);
        trainerDTOS.add(t12);
        trainerDTOS.add(t13);
        trainerDTOS.add(t14);
        trainerDTOS.add(t15);

        return trainerDTOS;
    }
    @Bean("getTrainerRecords")
    public List<TrainerRecordDTO> getTrainerRecords() {

        List<TrainerRecordDTO> trainerRecordDTOS = new ArrayList<>();

        TrainerRecordDTO r1  = new TrainerRecordDTO(1,  "Rahul Sharma",     5, "Java",          "rahul@gmail.com",   "rah@123", 9876543210L, "Bengaluru");
        TrainerRecordDTO r2  = new TrainerRecordDTO(2,  "Sneha Reddy",      3, "Python",        "sneha@gmail.com",   "sne@123", 9988776655L, "Mysuru");
        TrainerRecordDTO r3  = new TrainerRecordDTO(3,  "Amit Kumar",       7, "Data Science",  "amit@gmail.com",    "ami@123", 7766554433L, "Hubballi");
        TrainerRecordDTO r4  = new TrainerRecordDTO(4,  "Priya Sharma",     4, "AWS",           "priya@gmail.com",   "pri@123", 9123456781L, "Shivamogga");
        TrainerRecordDTO r5  = new TrainerRecordDTO(5,  "Vikram Singh",     6, "DevOps",        "vikram@gmail.com",  "vik@123", 9090909090L, "Belagavi");
        TrainerRecordDTO r6  = new TrainerRecordDTO(6,  "Divya Patel",      5, "UI/UX",         "divya@gmail.com",   "div@123", 9345678123L, "Tumakuru");
        TrainerRecordDTO r7  = new TrainerRecordDTO(7,  "Manoj Reddy",      8, "Cybersecurity", "manoj@gmail.com",   "man@123", 8090808080L, "Hassan");
        TrainerRecordDTO r8  = new TrainerRecordDTO(8,  "Kavya Sharma",     3, "Python",        "kavya@gmail.com",   "kav@123", 9012345678L, "Mandya");
        TrainerRecordDTO r9  = new TrainerRecordDTO(9,  "Rakesh Kumar",     6, "Java",          "rakesh@gmail.com",  "rak@123", 9786543210L, "Udupi");
        TrainerRecordDTO r10 = new TrainerRecordDTO(10, "Anusha Reddy",     4, "Data Science",  "anusha@gmail.com",  "anu@123", 8899776655L, "Davangere");
        TrainerRecordDTO r11 = new TrainerRecordDTO(11, "Girish Sharma",    7, "DevOps",        "girish@gmail.com",  "gir@123", 7766551122L, "Ballari");
        TrainerRecordDTO r12 = new TrainerRecordDTO(12, "Swati Patel",      5, "AWS",           "swati@gmail.com",   "swa@123", 9678543210L, "Raichur");
        TrainerRecordDTO r13 = new TrainerRecordDTO(13, "Harish Kumar",     6, "UI/UX",         "harish@gmail.com",  "har@123", 8877665544L, "Kalaburagi");
        TrainerRecordDTO r14 = new TrainerRecordDTO(14, "Sneha R Sharma",   4, "Python",        "sneha.r@gmail.com", "sne@124",9034567812L, "Kolar");
        TrainerRecordDTO r15 = new TrainerRecordDTO(15, "Yogesh Singh",     8, "Cybersecurity", "yogesh@gmail.com",  "yog@123", 9445566778L, "Chikkamagaluru");

        trainerRecordDTOS.add(r1);
        trainerRecordDTOS.add(r2);
        trainerRecordDTOS.add(r3);
        trainerRecordDTOS.add(r4);
        trainerRecordDTOS.add(r5);
        trainerRecordDTOS.add(r6);
        trainerRecordDTOS.add(r7);
        trainerRecordDTOS.add(r8);
        trainerRecordDTOS.add(r9);
        trainerRecordDTOS.add(r10);
        trainerRecordDTOS.add(r11);
        trainerRecordDTOS.add(r12);
        trainerRecordDTOS.add(r13);
        trainerRecordDTOS.add(r14);
        trainerRecordDTOS.add(r15);

        return trainerRecordDTOS;
    }
    @Bean("getVehicles")
    public List<VehicleDTO> getVehicles() {

        List<VehicleDTO> vehicleDTOS = new ArrayList<>();

        VehicleDTO v1  = new VehicleDTO(1,  "Honda City",      2020, "Car",    "hondacity@gmail.com", "hon@123", 9876543210L, "Bengaluru");
        VehicleDTO v2  = new VehicleDTO(2,  "Maruti Swift",    2019, "Car",    "marutiswift@gmail.com", "mar@123", 9988776655L, "Mysuru");
        VehicleDTO v3  = new VehicleDTO(3,  "Bajaj Pulsar",    2021, "Bike",   "bajajpulsar@gmail.com", "baj@123", 7766554433L, "Hubballi");
        VehicleDTO v4  = new VehicleDTO(4,  "Royal Enfield",   2022, "Bike",   "royalenfield@gmail.com", "roy@123", 9123456781L, "Shivamogga");
        VehicleDTO v5  = new VehicleDTO(5,  "Toyota Innova",   2020, "Car",    "toyotainnova@gmail.com", "toy@123", 9090909090L, "Belagavi");
        VehicleDTO v6  = new VehicleDTO(6,  "KTM Duke",        2019, "Bike",   "ktmduke@gmail.com", "ktm@123", 9345678123L, "Tumakuru");
        VehicleDTO v7  = new VehicleDTO(7,  "Hyundai Creta",   2021, "Car",    "hyundaicreta@gmail.com", "hyd@123", 8090808080L, "Hassan");
        VehicleDTO v8  = new VehicleDTO(8,  "Suzuki Gixxer",   2020, "Bike",   "suzukigixxer@gmail.com", "suz@123", 9012345678L, "Mandya");
        VehicleDTO v9  = new VehicleDTO(9,  "Ford Endeavour",  2022, "Car",    "fordendeavour@gmail.com", "for@123", 9786543210L, "Udupi");
        VehicleDTO v10 = new VehicleDTO(10, "Kawasaki Ninja", 2021, "Bike",   "kawasakininja@gmail.com", "kaw@123", 8899776655L, "Davangere");
        VehicleDTO v11 = new VehicleDTO(11, "Mahindra Thar",  2020, "Car",    "mahindrathar@gmail.com", "mah@123", 7766551122L, "Ballari");
        VehicleDTO v12 = new VehicleDTO(12, "Honda Activa",   2019, "Scooter","hondaactiva@gmail.com", "hon@124", 9678543210L, "Raichur");
        VehicleDTO v13 = new VehicleDTO(13, "Bajaj Platina",  2021, "Bike",   "bajajplatina@gmail.com", "baj@124", 8877665544L, "Kalaburagi");
        VehicleDTO v14 = new VehicleDTO(14, "Tata Nexon",     2022, "Car",    "tatanexon@gmail.com", "tat@123", 9034567812L, "Kolar");
        VehicleDTO v15 = new VehicleDTO(15, "Yamaha FZ",      2020, "Bike",   "yamaha@gmail.com", "yam@123", 9445566778L, "Chikkamagaluru");

        vehicleDTOS.add(v1);
        vehicleDTOS.add(v2);
        vehicleDTOS.add(v3);
        vehicleDTOS.add(v4);
        vehicleDTOS.add(v5);
        vehicleDTOS.add(v6);
        vehicleDTOS.add(v7);
        vehicleDTOS.add(v8);
        vehicleDTOS.add(v9);
        vehicleDTOS.add(v10);
        vehicleDTOS.add(v11);
        vehicleDTOS.add(v12);
        vehicleDTOS.add(v13);
        vehicleDTOS.add(v14);
        vehicleDTOS.add(v15);

        return vehicleDTOS;
    }
    @Bean("getVendors")
    public List<VendorDTO> getVendors() {

        List<VendorDTO> vendorDTOS = new ArrayList<>();

        VendorDTO v1  = new VendorDTO(1,  "Rahul Traders",     5, "Grocery",      "rahultraders@gmail.com", "rah@123", 9876543210L, "Bengaluru");
        VendorDTO v2  = new VendorDTO(2,  "Sneha Supplies",    3, "Clothing",     "snehasupplies@gmail.com", "sne@123", 9988776655L, "Mysuru");
        VendorDTO v3  = new VendorDTO(3,  "Amit Electronics",  7, "Electronics",  "amitelectronics@gmail.com", "ami@123", 7766554433L, "Hubballi");
        VendorDTO v4  = new VendorDTO(4,  "Priya Decor",       4, "Home Decor",   "priyadecor@gmail.com", "pri@123", 9123456781L, "Shivamogga");
        VendorDTO v5  = new VendorDTO(5,  "Vikram Furnitures", 6, "Furniture",    "vikramfurnitures@gmail.com", "vik@123", 9090909090L, "Belagavi");
        VendorDTO v6  = new VendorDTO(6,  "Divya Foods",       5, "Food",         "divyafoods@gmail.com", "div@123", 9345678123L, "Tumakuru");
        VendorDTO v7  = new VendorDTO(7,  "Manoj Traders",     8, "Grocery",      "manojsupplies@gmail.com", "man@123", 8090808080L, "Hassan");
        VendorDTO v8  = new VendorDTO(8,  "Kavya Fashion",     3, "Clothing",     "kavyafashion@gmail.com", "kav@123", 9012345678L, "Mandya");
        VendorDTO v9  = new VendorDTO(9,  "Rakesh Electronics",6, "Electronics",  "rakeshelectronics@gmail.com", "rak@123", 9786543210L, "Udupi");
        VendorDTO v10 = new VendorDTO(10, "Anusha Foods",      4, "Food",         "anushafoods@gmail.com", "anu@123", 8899776655L, "Davangere");
        VendorDTO v11 = new VendorDTO(11, "Girish Furnitures", 7, "Furniture",    "girishfurnitures@gmail.com", "gir@123", 7766551122L, "Ballari");
        VendorDTO v12 = new VendorDTO(12, "Swati Decor",       5, "Home Decor",   "swatidecor@gmail.com", "swa@123", 9678543210L, "Raichur");
        VendorDTO v13 = new VendorDTO(13, "Harish Electronics",6, "Electronics",  "harishelectronics@gmail.com", "har@123", 8877665544L, "Kalaburagi");
        VendorDTO v14 = new VendorDTO(14, "Sneha R Fashion",   4, "Clothing",     "sneharfashion@gmail.com", "sne@124",9034567812L, "Kolar");
        VendorDTO v15 = new VendorDTO(15, "Yogesh Traders",    8, "Grocery",      "yogeshtraders@gmail.com", "yog@123", 9445566778L, "Chikkamagaluru");

        vendorDTOS.add(v1);
        vendorDTOS.add(v2);
        vendorDTOS.add(v3);
        vendorDTOS.add(v4);
        vendorDTOS.add(v5);
        vendorDTOS.add(v6);
        vendorDTOS.add(v7);
        vendorDTOS.add(v8);
        vendorDTOS.add(v9);
        vendorDTOS.add(v10);
        vendorDTOS.add(v11);
        vendorDTOS.add(v12);
        vendorDTOS.add(v13);
        vendorDTOS.add(v14);
        vendorDTOS.add(v15);

        return vendorDTOS;
    }




}

