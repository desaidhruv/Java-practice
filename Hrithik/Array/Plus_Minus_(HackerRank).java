static void plusMinus(int[] arr) {
        
        double positive = 0,negative = 0, zeros = 0;
        
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == 0){
                zeros += 1;
            } else if(arr[i] < 0){
                negative += 1;
            } else if(arr[i] > 0){
                positive += 1;
            }
        }

        System.out.println(positive/arr.length);
        System.out.println(negative/arr.length);
        System.out.println(zeros/arr.length);


    }