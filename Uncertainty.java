public class Uncertainty {
   public static double f (double x, double z){
      return Math.pow(z, 3) * Math.pow(x, 2) * Math.pow(Math.E, z*x) + Math.pow(x, 2) * z;
   }
   public static double fx (double x, double z) {
      return Math.pow(z, 3) * x * Math.pow (Math.E, z*x)*(2+z*x) + 2*x*z;
   }
   public static double fz (double x, double z) {
      return Math.pow(z, 2) * Math.pow(x, 2) * Math.pow(Math.E, x*z) * (3+z*x) + Math.pow(x, 2);
   }
   public static void main(String[] args){
      double x = 1.23, rx = 0.04, z = 1.99, rz = 0.01;
      double ans = Math.sqrt( Math.pow(fx(x, z), 2) * rx * rx + Math.pow(fz(x, z), 2) * rz*rz );
      System.out.println("" + f(x, z));
      System.out.println("" + ans);
   }
}
/* Answers for Uncertainty:
2. a) (30.07 +- .03) cm
2. b) (189.7 +- .9) m
2. c) (94.05 +- .01) m
2. d) (5.9 +- .3) mm
3. a) (1330 +- 10) km
3. b) (44 +- 6)
3. c) (3.26 +- .06) mm
3. d) (0.58 +- .01) m s^-1
4. a) (149 +- 3) cm
4. b) (3370 +- 20) km^2 h^-2
5. a) (0.97 +- .03)
5. b) (140 +- 20)
*/
/* Answers for Uncertainty after conversion:
2. a) (0.3007 +- .0003) m
2. b) (189.7 +- .9) m
2. c) (94.05 +- .01) m
2. d) (5.9 +- .3)E-3 m
3. a) (1.33 +- .01)E6 m
3. b) (44 +- 6)
3. c) (3.26 +- .06)E-3 m
3. d) (0.58 +- .01) m s^-1
4. a) (1.49 +- .03) m
4. b) (260 +- 2) m^2 s^-2
5. a) (0.97 +- .03)
5. b) (140 +- 20)
*/
