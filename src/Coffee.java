public class Coffee {
    private String sort;
    private int bit;

    public Coffee (String y, int g){
        sort = y;
        g = bit;
    }

    public void print () {
        System.out.println("Print this message");
    }
    public boolean isGreaterThanFive(int v) {
    if (v > 5){
        return false;}
    return true; }
    public int process(int o) {
    if (isGreaterThanFive(o)) {
        return o + 2;
    }
    return o;}
}
