public class CreateThreadLambda{
    public static void main(String [] args){
        Thread evenNumberThread=new Thread(()->{
            for(int i=0;i<20;i++)
            {
                if(i%2==0){
                    System.out.println("Even Number Thread:"+i);
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        evenNumberThread.start();
        for(int i=0;i<20;i++)
        {
            if(i%2==1)
            {
                System.out.println("odd Number Thread:"+i);
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}    
