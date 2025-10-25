class Demo{
    public static void main(String[] args) {
        //TRY catch in exception handeling
        int[] marks = {98,87,78};
        try {
            System.out.println(marks[5]);
        } catch(Exception exception) {
            //do something after catching
        }
        System.out.println("The name is shiv");
        
    }
}