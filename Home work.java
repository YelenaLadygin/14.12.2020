//Targil 1
        Scanner s = new Scanner(System.in);
       int counter_1000 =-1000;
        do {
            System.out.println(counter_1000);
            counter_1000++;
        }
      while ( counter_1000 <= 1000);
      System.out.println("Goodbye..");
        
//Targil 4

        float temperature;
        do {
            System.out.println(" Enter the temperature: ");
            temperature = s.nextFloat();
            if (temperature > 37.5 && temperature <= 42)
                System.out.println(" sick");
            if (temperature > 35 && temperature <= 37.5)
                System.out.println("healthy");
            if (temperature < 35 || temperature > 42) {
               System.out.println(" out-of-range");
               break;}
                   }
        while (true);
        System.out.println("Goodbye..");
        
//Targil 2

         int rohav;
         int oreh;
         int hekef;

         do {
             System.out.println("Enter the rohav: ");
             rohav= s.nextInt();
             System.out.println("Enter the oreh : ");
             oreh= s.nextInt();
             System.out.println("Enter the hekef : ");
             hekef=s.nextInt();
         }
         while ( hekef != 2 * rohav + 2 * oreh ) ;
        System.out.println("you are right..");
        System.out.println("Goodbye..");
        
//Targil 3

        int rohav;
        int oreh;
        int hekef;

        do {
            System.out.println("Enter the rohav: ");
            rohav = s.nextInt();
            System.out.println("Enter the oreh : ");
            oreh = s.nextInt();
            System.out.println("Enter the hekef : ");
            hekef = s.nextInt();
            if (hekef == 2 * rohav + 2 * oreh) {
            System.out.println("you are right..");
             break;
            }
        }
        while ( true ) ;
        System.out.println("Goodbye..");

    }
}

