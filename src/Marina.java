import java.util.Scanner;

public class Marina {
    boolean terminalStop;
    double morningPassengersDif;
    double  morningBoatsDif;
    double dayPassengersDif;
    double  dayBoatsDif;
    double eveningPassengersDif;
    double  eveningBoatsDif;
    int maxPassengersOnStoppoint = 20;
    int speadboatCapacity = 50;
    int speadboatAvailableSeats = 0;

    void SetMarinaImitationModel(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите среднее время появления пассажиров утром в минутах: ");
        morningPassengersDif = scanner.nextDouble();
        System.out.print("Введите среднее время появления пассажиров днём в минутах: ");
        dayPassengersDif = scanner.nextDouble();
        System.out.print("Введите среднее время появления пассажиров вечером в минутах: ");
        eveningPassengersDif = scanner.nextDouble();

        System.out.print("Введите среднее время появления катера на причале утром в минутах: ");
        morningBoatsDif = scanner.nextDouble();
        System.out.print("Введите среднее время появления катера на причале днём в минутах: ");
        dayBoatsDif = scanner.nextDouble();
        System.out.print("Введите среднее время появления катера на причале вечером в минутах: ");
        eveningBoatsDif = scanner.nextDouble();

        System.out.print("Укажите тип остановки, если конечная введите число 1, если промежуточная  число 2: ");
        do{
                if(scanner.nextInt() == 1){
                terminalStop = true;
            }
            else if(scanner.nextInt() == 2){
                terminalStop = false;
            }
            else{
                    System.out.print("Вы ввели неверное число. Нужно ввести 1 или 2: ");
            }
        }while(scanner.nextInt()!=1 || scanner.nextInt()!=2);
    }

    void Calculations(){
        
    }



}
