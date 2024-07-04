import java.util.Scanner;
class Airline_Reservation_System
{
    int flight_count,revenue=0;
    String n,name,random,flight_number,departure_city,destination_city,departure_time,arrival_time;
    Scanner sc=new Scanner(System.in);
    int temp=0;
    int key=0;
    int m,swap,bal,book_flight_var=0,seats,payment,count=0,num=0;
    String flight[][]=new String[50][5];
    String passanger[][]=new String[200][5];
    int base_fare[][]=new int[50][1];
    void checkadminoruser()
    {
        System.out.println("\nWelcome To The Rudra Airlines!!!!");
        System.out.println("Enter 1 For Admin Panel");
        System.out.println("Enter 2 For User Panel");
        System.out.println("Enter 3 For Exit");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        int flag=0;
        while(flag==0)
        {
            if(choice==1)
            {
                System.out.println("Enter Password:");
                int Password=sc.nextInt();
                if(Password==1234)
                {
                    System.out.println("Admin Access Granted Successfully...");
                    admin();
                    flag=1;
                }
                else
                {
                    System.out.println("You Enterd Wrong Password!!");
                }
            }
            else if(choice==2)
            {
                login();
                flag=1;
            }
            else if(choice==3)
            {
                return;
            }
            else
            {
                System.out.println("Please Enter Valid Choice...");
                choice=sc.nextInt();
            }
        }
        
    }


    //Admin Panel Starts Here


    void admin()
    {
        int loop=1;
        while(loop==1)
        {
            System.out.println("\n");
            System.out.println("Enter 1 For View Available Flights:");
            System.out.println("Enter 2 For Add Flights:");
            System.out.println("Enter 3 For Edit Flights:");
            System.out.println("Enter 4 For Cancel Flights:");
            System.out.println("Enter 5 To See Pasangers Details:");
            System.out.println("Enter 6 For View Numbers Of Booked Flights:");
            System.out.println("Enter 7 For View Revenue:");
            System.out.println("Enter 8 For Log Out:");
            int choice=sc.nextInt();
            int flag=0;
            
            while(flag==0)
            {
                if(choice==1)
                {
                    
                    flag=1;
                    viewschedule();
                }
                else if(choice==2)
                {
                    addschedule();
                    flag=1;
                    flight_count++;
                    temp=temp+1;
                }
                else if(choice==3)
                {
                    editschedule();
                    flag=1;
                }
                else if(choice==4)
                {
                    removeschedule();
                    flag=1;
                }
                else if(choice==5)
                {
                    show_passanger_details();
                    flag=1;
                }
                else if(choice==6)
                {
                    view_number_of_booked_flights();
                    flag=1;
                }
                else if(choice==7)
                {
                    view_revenue();
                    flag=1;
                }
                else if(choice==8)
                {
                    checkadminoruser();
                    flag=1;
                }
                else
                {
                    System.out.println("Please Enter Valid Choice...");
                    choice=sc.nextInt();
                }
            }
            System.out.println("\n");
        }
    }
    void viewschedule()
    {
        if(flight_count==0)
        {
            System.out.println("\nThere is no Flight Avaialable...");
        }
        else
        {
            for(temp=0;temp<flight_count;temp++)
            {
                System.out.println("\n\nFlight id:"+(temp+1));
                for(int j=0;j<5;j++)
                {
                    if(j==0)
                    {
                        System.out.println("Flight Number: "+flight[temp][j]);
                    }
                    else if(j==1)
                    {
                        System.out.println("Departure City: "+flight[temp][j]);
                    }
                    else if(j==2)
                    {
                        System.out.println("Destination City: "+flight[temp][j]);
                    }
                    else if(j==3)
                    {
                        System.out.println("Departure Time: "+flight[temp][j]);
                    }
                    else if(j==4)
                    {
                        System.out.println("Arrival Time: "+flight[temp][j]);
                    }
                }
                System.out.println("Base Fare: "+base_fare[temp][0]);
            }
        }
    }
    void addschedule()
    {
        
        System.out.println("\nEnter Flight Details...\n");
        random=sc.nextLine();
        System.out.println("Enter Flight Number:");
        flight[temp][0]=sc.nextLine();
        System.out.println("Enter Departure City:");
        flight[temp][1]=sc.nextLine();
        System.out.println("Enter Destination City:");
        flight[temp][2]=sc.nextLine();
        System.out.println("Enter Departure Time:");
        flight[temp][3]=sc.nextLine();
        System.out.println("Enter Arrival Time:");
        flight[temp][4]=sc.nextLine();
        System.out.println("Enter Base Fare: (Note:Enter Number Only)");
        System.out.print("Rupee: ");
        base_fare[temp][0]=sc.nextInt();
        System.out.println("\n\nYour Flight Schedule Successfully Added...");

    }
    void editschedule()
    {
        random=sc.nextLine();
        System.out.println("\nEnter Flight Number For Updating Flight Details:");
        n=sc.nextLine();
        for(temp=0;temp<flight_count;temp++)
        {
            if(n.equals(flight[temp][0]))
            {
                key=1;
                if(flight_count==0)
                {
                    System.out.println("There is No Flight Available...");
                }
                else
                {
                    System.out.println("\nEnter 'Enter' key If You Don't Want To Change...");
                    System.out.println("\nATTENSION:\"DO NOT PRESS ENTER KEY FOR BASE FARE\"\n");
                    System.out.println("Enter Flight Number:");
                    random=sc.nextLine();
                    if(random.equals(""))
                    {

                    }
                    else
                    {
                        flight[temp][0]=random;
                    }
                    System.out.println("Enter Departure City:");
                    random=sc.nextLine();
                    if(random.equals(""))
                    {

                    }
                    else
                    {
                        flight[temp][1]=random;
                    }
                    System.out.println("Enter Destination City:");
                    random=sc.nextLine();
                    if(random.equals(""))
                    {

                    }
                    else
                    {
                        flight[temp][2]=random;
                    }
                    
                    System.out.println("Enter Departure Time:");
                    random=sc.nextLine();
                    if(random.equals(""))
                    {

                    }
                    else
                    {
                        flight[temp][3]=random;
                    }
                    System.out.println("Enter Arrival Time:");
                    random=sc.nextLine();
                    if(random.equals(""))
                    {

                    }
                    else
                    {
                        flight[temp][4]=random;
                    }
                    System.out.println("Enter Base Fare: (Note:Enter Number Only)");
                    System.out.print("Rupee:");
                    m=sc.nextInt();
                    base_fare[temp][0]=m;
                    
                    System.out.println("Flight Updated Successfully...");
                }
            }
            if(key==0)
            {
                System.out.println("Sorry,This Flight Cannot Found");
            }
        }
    }
    void removeschedule()
    {
        key=0;
        random=sc.nextLine();
        if(flight_count==0)
        {
            System.out.println("\nSorry,There is No Flight Available!!!!");
        }
        else
        {
            System.out.println("\nEnter Flight Number For Canceling Flight Details:");
            n=sc.nextLine();
            for(temp=0;temp<flight_count;temp++)
            {
                if(n.equals(flight[temp][0]))
                {
                    key=1;
                    flight[temp][0]=flight[temp+1][0];
                    flight[temp][1]=flight[temp+1][1];
                    flight[temp][2]=flight[temp+1][2];
                    flight[temp][3]=flight[temp+1][3];
                    flight[temp][4]=flight[temp+1][4];
                    base_fare[temp][0]=base_fare[temp+1][0];
                    flight_count--;
                    temp--;
                    System.out.println("Flight Canceled Successfully...");
                }   
            }
            if(key==0)
            {
                System.out.println("Sorry,This Flight is Not Found!!!");
            }
        }
    }
    void show_passanger_details()
    {
        if(count==0)
        {
            System.out.println("\nThere is No Flight is Booked!!!");
        }
        else
        {
            for(temp=0;temp<count;temp++)
            {
                System.out.println("\n\nPassanger "+(temp+1)+" Details");
                for(int j=0;j<5;j++)
                {
                    if(j==0)
                    {
                        System.out.println("Name: "+passanger[temp][j]);
                    }
                    else if(j==1)
                    {
                        System.out.println("Age: "+passanger[temp][j]);
                    }
                    else if(j==2)
                    {
                        System.out.println("Birthday: "+passanger[temp][j]);
                    }
                    else if(j==3)
                    {
                        System.out.println("Country: "+passanger[temp][j]);
                    }
                    else if(j==4)
                    {
                        System.out.println("City: "+passanger[temp][j]);
                    }
                }
            }
        }
    }

    void view_number_of_booked_flights()
    {
        System.out.println("The Total Number of booked flight is "+book_flight_var);
    }
    void view_revenue()
    {
        System.out.println("The Total Revenue is "+revenue);
    }
    


    //Admin Panel Ends Here


    //User Panel Starts Here

    void login()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        name=sc.nextLine();
        System.out.println("Enter Your Initial Balance:");
        bal=sc.nextInt();
        System.out.println("\nWelcome, "+name+"!");
        user();
    }
    void user()
    {
        int loop=1;
        while(loop==1)
        {
            System.out.println("\n");
            System.out.println("Enter 1 For View Available Flights:");
            System.out.println("Enter 2 For Search Flights By Departure City:");
            System.out.println("Enter 3 For Search Flights By Destination City");
            System.out.println("Enter 4 For Search Flights By Flight Numbers:");
            System.out.println("Enter 5 For Sort Flights By Fare:");
            System.out.println("Enter 6 For View Balance:");
            System.out.println("Enter 7 For Add Balance:");
            System.out.println("Enter 8 For Book Flight:");
            System.out.println("Enter 9 For Log Out:");
            int choice=sc.nextInt();
            int flag=0;
            
            while(flag==0)
            {
                if(choice==1)
                {
                    
                    flag=1;
                    viewschedule();
                }
                else if(choice==2)
                {
                    search_by_departure();
                    flag=1;
                }
                else if(choice==3)
                {
                    search_by_destination();
                    flag=1;
                }
                else if(choice==4)
                {
                    search_by_flightnumber();
                    flag=1;
                }
                else if(choice==5)
                {
                    sort_flight_by_fare();
                    flag=1;
                }
                else if(choice==6)
                {
                    view_balance();
                    flag=1;
                }
                else if(choice==7)
                {
                    add_balance();
                    flag=1;
                }
                else if(choice==8)
                {
                    book_flight();
                    flag=1;
                }
                else if(choice==9)
                {
                    System.out.println("\n");
                    checkadminoruser();
                    flag=1;
                }
                else
                {
                    System.out.println("Please Enter Valid Choice...");
                    choice=sc.nextInt();
                }
                System.out.println("\n");
            }
        }
    }
    
    void search_by_departure()
    {
        if(flight_count==0)
        {
            System.out.println("\nSorry,There is No Flight Available!!!!");
        }
        else
        {
            key=0;
            random=sc.nextLine();
            System.out.println("\nEnter Departure City For Finding Flight Details:");
            n=sc.nextLine();
            for(temp=0;temp<flight_count;temp++)
            {
                if(n.equals(flight[temp][1]))
                {
                    key=1;
                    for(int j=0;j<5;j++)
                    {
                        if(j==0)
                        {
                            System.out.println("\nFlight Number: "+flight[temp][j]);
                        }
                        else if(j==1)
                        {
                            System.out.println("Departure City: "+flight[temp][j]);
                        }
                        else if(j==2)
                        {
                            System.out.println("Destination City: "+flight[temp][j]);
                        }
                        else if(j==3)
                        {
                            System.out.println("Departure Time: "+flight[temp][j]);
                        }
                        else if(j==4)
                        {
                            System.out.println("Arrival Time: "+flight[temp][j]);
                        }
                        
                    }
                    System.out.println("Base Fare: "+base_fare[temp][0]);
                }
            }
            if(key==0)
            {
                System.out.println("The Flight Whose Departure City is "+n+" is not Found...");
            }
        }
    }
    void search_by_destination()
    {
        if(flight_count==0)
        {
            System.out.println("\nSorry,There is No Flight Available!!!!");
        }
        else
        {
            key=0;
            random=sc.nextLine();
            System.out.println("\nEnter Destination City For Finding Flight Details:");
            n=sc.nextLine();
            for(temp=0;temp<flight_count;temp++)
            {
                if(n.equals(flight[temp][2]))
                {
                    key=1;
                    for(int j=0;j<6;j++)
                    {
                        if(j==0)
                        {
                            System.out.println("\nFlight Number: "+flight[temp][j]);
                        }
                        else if(j==1)
                        {
                            System.out.println("Departure City: "+flight[temp][j]);
                        }
                        else if(j==2)
                        {
                            System.out.println("Destination City: "+flight[temp][j]);
                        }
                        else if(j==3)
                        {
                            System.out.println("Departure Time: "+flight[temp][j]);
                        }
                        else if(j==4)
                        {
                            System.out.println("Arrival Time: "+flight[temp][j]);
                        }
                        
                    }
                    System.out.println("Base Fare: "+base_fare[temp][0]);
                }
            }
            if(key==0)
            {
                System.out.println("The Flight Whose Destination City is "+n+" is not Found...");
            }
        }
    }
    void search_by_flightnumber()
    {
        key=0;
        random=sc.nextLine();
        System.out.println("\nEnter Flight Number For Finding Flight Details:");
        n=sc.nextLine();
        for(temp=0;temp<flight_count;temp++)
        {
            if(n.equals(flight[temp][0]))
            {
                key=1;
                for(int j=0;j<6;j++)
                {
                    if(j==0)
                    {
                        System.out.println("\nFlight Number: "+flight[temp][j]);
                    }
                    else if(j==1)
                    {
                        System.out.println("Departure City: "+flight[temp][j]);
                    }
                    else if(j==2)
                    {
                        System.out.println("Destination City: "+flight[temp][j]);
                    }
                    else if(j==3)
                    {
                        System.out.println("Departure Time: "+flight[temp][j]);
                    }
                    else if(j==4)
                    {
                        System.out.println("Arrival Time: "+flight[temp][j]);
                    }
                }
                System.out.println("Base Fare: "+base_fare[temp][0]);
            }
        }
        if(key==0)
        {
            System.out.println("The Flight Whose Flight Number is "+n+" is not Found...");
        }
    }
    void sort_flight_by_fare()
    {
        if(flight_count==0)
        {
            System.out.println("There is No Flight Available...");
        }
        else
        {
            String flightv2[][]=new String[50][5];
            int base_farev2[][]=new int[50][1];
            for(temp=0;temp<flight_count;temp++)
            {
                for(int j=0;j<5;j++)
                {
                    flightv2[temp][j]=flight[temp][j];
                    base_farev2[temp][0]=base_fare[temp][0];
                }
            }
            int j,swap;
            String swaps;
            for(j=0;j<flight_count;j++)
            {
                for(temp=0;temp<(flight_count-1)-j;temp++)
                {
                    if(base_farev2[temp][0]>base_farev2[temp+1][0])
                    {
                        
                
                        swaps=flightv2[temp][0];
                        flightv2[temp][0]=flightv2[temp+1][0];
                        flightv2[temp+1][0]=swaps;

                        swaps=flightv2[temp][1];
                        flightv2[temp][1]=flightv2[temp+1][1];
                        flightv2[temp+1][1]=swaps;

                        swaps=flightv2[temp][2];
                        flightv2[temp][2]=flightv2[temp+1][2];
                        flightv2[temp+1][2]=swaps;

                        swaps=flightv2[temp][3];
                        flightv2[temp][3]=flightv2[temp+1][3];
                        flightv2[temp+1][3]=swaps;

                        swaps=flightv2[temp][4];
                        flightv2[temp][4]=flightv2[temp+1][4];
                        flightv2[temp+1][4]=swaps;

                        swap=base_farev2[temp][0];
                        base_farev2[temp][0]=base_farev2[temp+1][0];
                        base_farev2[temp+1][0]=swap;
                    
                        
                    }
                }
            }
            for(int i=0;i<flight_count;i++)
            {
                System.out.println("\n\nFlight id:"+(i+1));
                for(int k=0;k<5;k++)
                {
                    if(k==0)
                    {
                        System.out.println("Flight Number: "+flightv2[i][k]);
                    }
                    else if(k==1)
                    {
                        System.out.println("Departure City: "+flightv2[i][k]);
                    }
                    else if(k==2)
                    {
                        System.out.println("Destination City: "+flightv2[i][k]);
                    }
                    else if(k==3)
                    {
                        System.out.println("Departure Time: "+flightv2[i][k]);
                    }
                    else if(k==4)
                    {
                        System.out.println("Arrival Time: "+flightv2[i][k]);
                    }
                }
                System.out.println("Base Fare: "+base_farev2[i][0]);
            }
        }
    }
    void view_balance()
    {
        System.out.println("\nYour Current Balance is "+bal);
    }
    void add_balance()
    {
        int t;
        System.out.println("\nEnter Amount Of Money That You Want To Add:");
        t=sc.nextInt();
        bal=bal+t;
        System.out.println("\nYour Balance is Updated Successfully...");
    }
    void book_flight()
    {
        random=sc.nextLine();
        key=0;
        String fn;
        System.out.println("\nEnter Flight Number Of Flight That You Want To Book:");
        fn=sc.nextLine();
        for(temp=0;temp<flight_count;temp++)
        {
            if(fn.equals(flight[temp][0]))
            {
                if(bal>=base_fare[temp][0])
                {
                    
                    key=1;
                    int availavle_flight=50-book_flight_var;
                    if(availavle_flight==0)
                    {
                        System.out.println("Sorry,This Flight is Full,You Cannot Book This Flight...");
                    }
                    else
                    {
                        System.out.println("The Available Seat is "+availavle_flight);
                        int loop=0;
                        while(loop==0)
                        {
                            System.out.println("How Many Seats Do You Want To Book?");
                            seats=sc.nextInt();
                            if(availavle_flight<seats)
                            {
                                System.out.println("Sorry,You Can Book Only "+availavle_flight+" Seats");
                            }
                            else
                            {
                                
                                loop=1;
                                int set_payment=base_fare[temp][0]*seats;  
                                if(bal>=set_payment)
                                {   
                                    num=0;
                                    random=sc.nextLine(); 
                                    while(num<seats)
                                    {
                                        System.out.println("Enter Passenger "+(num+1)+" Details:");
                                        
                                        System.out.println("Enter Name:");
                                        passanger[num][0]=sc.nextLine();
                                        System.out.println("Enter Age:");
                                        passanger[num][1]=sc.nextLine();
                                        System.out.println("Enter Birthday:(dd-mm-yy)");
                                        passanger[num][2]=sc.nextLine();
                                        System.out.println("Enter Country:");
                                        passanger[num][3]=sc.nextLine();
                                        System.out.println("Enter City:");
                                        passanger[num][4]=sc.nextLine();
                                        count++;
                                        num++;
                                    }
                                    System.out.println("You Have To Pay "+set_payment+" Rupees To Book This Flight:");
                                    loop=0;
                                    while(loop==0)
                                    {
                                        System.out.println("Please Enter Money:");
                                        payment=sc.nextInt();
                                        if(payment==set_payment)
                                        {
                                            loop=1;
                                            System.out.println("\nYour Payment Received Successfully...");
                                            System.out.println("You Booked This Flight Successfully...");
                                            revenue=payment+revenue;
                                            book_flight_var+=seats;
                                            bal=bal-payment;
                                        }
                                        else if(payment>set_payment)
                                        {
                                            System.out.println("By Mistake,You Paid Extra Money So Your Current Payment Canceled...");
                                        }
                                        else if(payment<set_payment)
                                        {
                                            System.out.println("Please Pay Sufficient Money To Book This Flight,Your Current Payment Canceled...");
                                        }
                                    }
                                }
                                else
                                {
                                    System.out.println("You Must Have "+set_payment+" Rupees To Book This Flight...");
                                }
                            }
                        }
                    }
                }
                else
                {
                    System.out.println("Sorry,You Have Not Sufficient Balance To Book This Flight...");
                }
            }
            
        }
        if(key==0)
        {
            System.out.println("Sorry,This Flight is Not Founded...");
        }
    }
    //User Panel Ends Here
}