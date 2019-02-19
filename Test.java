import java.util.Scanner;

public class Test{
  public static void main(String[] arg){
    int key1 = 0;
    int key2 = 0;


    Saxophone sax1 = new Saxophone();
    Saxophone sax2 = new Saxophone();

    Scanner reader = new Scanner(System.in);
    System.out.println("Insert first saxophone type!");
    String sisend = reader.nextLine();

    if(sisend.equals("SOPRANISSIMO")){
      sax1.ChangeInstrument(Type.SOPRANISSIMO);
      sax1.DefineKey();
      System.out.println(sax1);
      key1 = 1;
    }else{
      if(sisend.equals("SOPRANINO")){
        sax1.ChangeInstrument(Type.SOPRANINO);
        sax1.DefineKey();
        System.out.println(sax1);
          key1 = 2;
      }else{
        if(sisend.equals("SOPRANO")){
          sax1.ChangeInstrument(Type.SOPRANO);
          sax1.DefineKey();
          System.out.println(sax1);
          key1 = 1;
        }else{
          if(sisend.equals("ALTO")){
            sax1.ChangeInstrument(Type.ALTO);
            sax1.DefineKey();
            System.out.println(sax1);
            key1 = 2;
          }else{
            if(sisend.equals("TENOR")){
              sax1.ChangeInstrument(Type.TENOR);
              sax1.DefineKey();
              System.out.println(sax1);
              key1 = 1;
            }else{
              if(sisend.equals("BARITONE")){
                sax1.ChangeInstrument(Type.BARITONE);
                sax1.DefineKey();
                System.out.println(sax1);
                key1 = 2;
              }else{
                if(sisend.equals("BASS")){
                  sax1.ChangeInstrument(Type.BASS);
                  sax1.DefineKey();
                  System.out.println(sax1);
                  key1 = 1;
                }else{
                  if(sisend.equals("CONTRABASS")){
                    sax1.ChangeInstrument(Type.CONTRABASS);
                    sax1.DefineKey();
                    System.out.println(sax1);
                    key1 = 2;
                  }else{
                    if(sisend.equals("SUBCONTRABASS")){
                      sax1.ChangeInstrument(Type.SUBCONTRABASS);
                      sax1.DefineKey();
                      System.out.println(sax1);
                      key1 = 1;
                    }else{
                      System.out.println("Sisestasite vale tyybi!");

                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    //System.out.println(key1);

    Scanner reader2 = new Scanner(System.in);
    System.out.println("Insert second saxophone type!");
    String sisend2 = reader2.nextLine();

    if(sisend2.equals("SOPRANISSIMO")){
      sax2.ChangeInstrument(Type.SOPRANISSIMO);
      sax2.DefineKey();
      System.out.println(sax2);
      key2 = 1;
    }else{
      if(sisend2.equals("SOPRANINO")){
        sax2.ChangeInstrument(Type.SOPRANINO);
        sax2.DefineKey();
        System.out.println(sax2);
        key2 = 2;
      }else{
        if(sisend2.equals("SOPRANO")){
          sax2.ChangeInstrument(Type.SOPRANO);
          sax2.DefineKey();
          System.out.println(sax2);
            key2 = 1;
        }else{
          if(sisend2.equals("ALTO")){
            sax2.ChangeInstrument(Type.ALTO);
            sax2.DefineKey();
            System.out.println(sax2);
            key2 = 2;
          }else{
            if(sisend2.equals("TENOR")){
              sax2.ChangeInstrument(Type.TENOR);
              sax2.DefineKey();
              System.out.println(sax2);
                key2 = 1;
            }else{
              if(sisend2.equals("BARITONE")){
                sax2.ChangeInstrument(Type.BARITONE);
                sax2.DefineKey();
                System.out.println(sax2);
                key2 = 2;
              }else{
                if(sisend2.equals("BASS")){
                  sax2.ChangeInstrument(Type.BASS);
                  sax2.DefineKey();
                  System.out.println(sax2);
                    key2 = 1;
                }else{
                  if(sisend2.equals("CONTRABASS")){
                    sax2.ChangeInstrument(Type.CONTRABASS);
                    sax2.DefineKey();
                    System.out.println(sax2);
                    key2 = 2;
                  }else{
                    if(sisend2.equals("SUBCONTRABASS")){
                      sax2.ChangeInstrument(Type.SUBCONTRABASS);
                      sax2.DefineKey();
                      System.out.println(sax2);
                        key2 = 1;
                    }else{
                      System.out.println("Sisestasite vale tyybi!");

                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    //System.out.println(key2);

  if(key1 != 0){
    if(key2 != 0){
      if(key1 == key2){
        System.out.println(sisend+" has the same key as "+sisend2);
      }else{
        System.out.println(sisend+" does not have the same key as "+sisend2);
      }
    }
  }









    /*sax2.ChangeInstrument(Type.BARITONE);
    sax2.DefineKey();
    System.out.println(sax2);*/
  }
}
