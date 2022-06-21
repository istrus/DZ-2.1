public class Main {
    public static void main(String[] args) {
        int ticketPrice = 2000; // цена билета
        int costForMile = 20; //  кол-во рублей на 1 бонусную милю

        int milesForTicket = ticketPrice / costForMile; // кол-во начисленных мили за билет


        System.out.println("Количество начисленных мили за билет: " + milesForTicket);

    }
}
