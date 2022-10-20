
class car {        
    void move(){
           engine e1 = new engine(); 
           String info = e1.start();
        
        System.out.println(info);
        System.out.println("car is moving!!"); 
    }
}

class engine{
        String start(){
            return "engine started !!!";
    }
}

class returntype{
    public static void main(String[] args) {
        
        String s1 = "Raunak";
            int a=s1.length();
            System.out.println(a);
        // car c1 = new car();
        // c1.move();
    }
    
}