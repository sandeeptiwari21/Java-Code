public class strin3 {
    public static double getshortestpath(String path){
        int x=0; y=0;
        for(int i=0; i<path.Length(); i++){
            Char dir=path.charAt(i);
            //south
            if(dir=='s'){
                y--;
            }
            //north
            else if(dir=='n'){
                y++;
            }
            //west
            else if(dir=='w'){
                x--;
            }//east
            else{
                x++;
            }
        }
    }
    //calculate shortest patrh using pathagoren thoerm

    return (double)Math.Sqrt( x*x+y*y);
    public static void main(String[] args) {
        String path="wneenesennn";
        System.out.println(getshortestpath(path));  
    }
}
