public class Practice2
{
    public:
        int weight ; 
        double meter ;
    Practice2(int weight , int meter)
    void setweight()
    {
        weight = this.weight;
    }
    void setmeter()
    {
        meter = this.meter ;
    }
    int getweight()
    {
        return weight;
    }
    double getheight()
    {
        return meter ;
    }
    void display_bmi()
    {
        int bmi  = weight / (height * height);
        System.out.println(bmi);
    }
    public static void main(String args[])
    {
        Practice2 h = new Practice2(111,1.8);
        h.display_bmi();

    }
}