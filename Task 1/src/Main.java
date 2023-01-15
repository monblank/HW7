import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
        System.out.println("Введите количество Жабьих глаз: ");
        toadEyesCount = extracted().nextInt();
        System.out.println("Введите количество Слез вурдалака: ");
        ghoulTearsCount = extracted().nextInt();
        System.out.println("Введите количество Костей ворона: ");
        ravenBonesCount = extracted().nextInt();
        System.out.println("Введите количество Пельмений: ");
        dumplingsCount = extracted().nextInt();
        
        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
        	System.out.println("Вы можете приготовить Эликсир зоркости");
            System.out.println("Приготовить (1 - да; 2 - нет): ");
            if (extracted().nextInt() == 1) {
            	toadEyesCount -= 3;
            	ravenBonesCount--;
            	System.out.println("Вы приготовили Эликсир зоркости");
            	System.out.println("У вас осталось Жабьих глаз: " + toadEyesCount +
            			" Слез вурдалака: " + ghoulTearsCount + " Костей ворона: " +
            			ravenBonesCount + " Пельмений: " + dumplingsCount);
            }
        	
        }
        
        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
        	System.out.println("Вы можете приготовить Эликсир стойкости");
            System.out.println("Приготовить (1 - да; 2 - нет): ");
            if (extracted().nextInt() == 1) {
            	ravenBonesCount -= 2;
            	dumplingsCount -= 4;
            	System.out.println("Вы приготовили Эликсир стойкости");
            	System.out.println("У вас осталось Жабьих глаз: " + toadEyesCount +
            			" Слез вурдалака: " + ghoulTearsCount + " Костей ворона: " +
            			ravenBonesCount + " Пельмений: " + dumplingsCount);
            }
        	
        }
        
        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
        	System.out.println("Вы можете приготовить Эликсир скрытности");
            System.out.println("Приготовить (1 - да; 2 - нет): ");
            if (extracted().nextInt() == 1) {
            	ghoulTearsCount -= 7;
            	dumplingsCount--;
            	toadEyesCount -= 2;
            	System.out.println("Вы приготовили Эликсир скрытности");
            	System.out.println("У вас осталось Жабьих глаз: " + toadEyesCount +
            			" Слез вурдалака: " + ghoulTearsCount + " Костей ворона: " +
            			ravenBonesCount + " Пельмений: " + dumplingsCount);
            }
        	
        }
        
        if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
        	System.out.println("Вы можете приготовить Запретный эликсир");
            System.out.println("Приготовить (1 - да; 2 - нет): ");
            if (extracted().nextInt() == 1) {
            	ghoulTearsCount -= 5;
            	dumplingsCount -= 10;
            	toadEyesCount -= 4;
            	ravenBonesCount -= 3;
            	System.out.println("Вы приготовили Запретный эликсир");
            	System.out.println("У вас осталось Жабьих глаз: " + toadEyesCount +
            			" Слез вурдалака: " + ghoulTearsCount + " Костей ворона: " +
            			ravenBonesCount + " Пельмений: " + dumplingsCount);
            }
        	
        }
        
        
    }

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
