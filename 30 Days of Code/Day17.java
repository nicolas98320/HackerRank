class Calculator {
    int power(int n, int p) throws Exception {
        int res = 0;
        if (n >= 0 && p >= 0)
            res = (int) Math.pow(n, p);
        else    
            throw new Exception("n and p should be non-negative");
        return res;
    }
}