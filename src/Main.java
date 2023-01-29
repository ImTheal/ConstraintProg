import java.util.List;

public class Main {
    public static void main(String[] args) {
        nQueens(13);
    }


    private static void nQueens(int nb){
        int nbSol = 0;
        long t0=System.currentTimeMillis();
        Permutations gen= new Permutations(nb);
        for (List<Integer> p: gen){
            if(isQSol(p,nb)){
                System.out.println(p);
                nbSol++;
            }
        }
        long t1=System.currentTimeMillis();
        System.out.println("Time : "+(t1-t0)+"ms" + "\n Nombre de solutions : " +nbSol);

    }

    private static boolean isQSol(List<Integer> p, int size){
        for (int colA= 0; colA < size; colA++) {
            int ligA = p.get(colA);
            for (int colB = colA + 1; colB < size; colB++) {
                int ligB = p.get(colB);
                if (Math.abs(ligB - ligA) == Math.abs(colB - colA))
                    return false;
            }
        }
        return true;
    }

    private static void alpha12() {
        long t0=System.currentTimeMillis();
        Permutations gen= new Permutations(12,1);
        for (List<Integer> v: gen) {
            int A=v.get(0);
            int B=v.get(1);
            int C=v.get(2);
            int E=v.get(3);
            int F=v.get(4);
            int L=v.get(5);
            int N=v.get(6);
            int O=v.get(7);
            int Q=v.get(8);
            int R=v.get(9);
            int T=v.get(10);
            int U=v.get(11);
            //int S=v.get(12);


            int ballet=B+A+L+L+E+T;
            int concert=C+O+N+C+E+R+T;
            int oboe=O+B+O+E;
            int cello=C+E+L+L+O;
            int flute=F+L+U+T+E;
            int quartet=Q+U+A+R+T+E+T;
//            int solo=S+O+L+O;

//            if (ballet==24 &&
//                    concert ==48 &&
//                    oboe==34 &&
//                    cello==29 &&
//                    flute==32 &&
//                    quartet==39
//                    //solo==37
//            )


            if(ballet!=24)
                continue;
            if(concert!=48)
                continue;
            if(oboe!=34)
                continue;
            if(cello!=29)
                continue;
            if(flute!=32)
                continue;
            if(quartet!=39)
                continue;

                System.out.println(v);
        }
        long t1=System.currentTimeMillis();
        System.out.println("Time : "+(t1-t0)/1000+"s");
    }
    private static void MoneyGT() {
        long t0=System.currentTimeMillis();
        KPermutations gen= new KPermutations(8,10);
        for (List<Integer> v: gen) {
            int S=v.get(0);
            int E=v.get(1);
            int N=v.get(2);
            int D=v.get(3);
            int M=v.get(4);
            int O=v.get(5);
            int R=v.get(6);
            int Y=v.get(7);

            int send=1000*S+100*E+10*N+D;
            int more=1000*M+100*O+10*R+E;
            int money= 10000*M+1000*O+100*N+10*E+Y;

            if (v.get(0)!=0 && v.get(4)!=0
                    && send+more==money)
            System.out.println(v);
        }
        long t1=System.currentTimeMillis();
        System.out.println("Time : "+(t1-t0)+"ms");
    }


    private static void twoGT(){
        long t0=System.currentTimeMillis();
        for (int t = 0; t <= 9 ; t++) {
            if (t==0)
                continue;

            for (int w = 0; w <= 9 ; w++) {
                if (w==t)
                    continue;

                for (int o = 0; o <= 9 ; o++) {
                    if (o==t || o==w)
                        continue;

                    for (int f = 0; f <= 9 ; f++) {
                        if (f==0 || f==t || f==w || f==o)
                            continue;
                        for (int u = 0; u <= 9 ; u++) {
                            if (u==t || u==w || u==o || u==f)
                                continue;
                            for (int r = 0; r <= 9 ; r++) {
                                if (r==t || r==w || r==o || r==f || r==u)
                                    continue;

                                if(2*(100*t+10*w+o)==(1000*f+100*o+10*u+r)){
                                    System.out.println(" t= "+t+" w= "+w+" o= "+o+" f= "+f+" u= "+u+" r= "+r);
                                    long t1=System.currentTimeMillis();
                                    System.out.println("Time : "+(t1-t0)+"ms");
                                }
                            }
                        }
                    }
                }
            }

        }
    }

}