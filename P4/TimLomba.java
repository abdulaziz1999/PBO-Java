class TimLomba{
    public static void main(String[] args){
        String namaTim[][] = {
            {"Abdul","Aziz","Permana"},
            {"Anti","Aini","Ani"},
            {"Asep","Usep","Saifuloh"}
        };

        for(int i=0; i<namaTim.length; i++){
            for(int j=0; j<namaTim[i].length; j++){
                System.out.println(namaTim[i][j]);
            }

            System.out.println("");
        }
    }
}