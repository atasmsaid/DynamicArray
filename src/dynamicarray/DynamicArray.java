package dynamicarray;

public class DynamicArray {

    private int[] array = null;
    private int kapasite = 5;
    private int boyut = 0;
    private int index = 0;

    public DynamicArray() {
        array = new int[kapasite];
    }
    
    public void ekle(int veri) {
        
        if (boyut==kapasite) {
            dizi_genislet();
        }
        
        array[boyut]=veri;
        boyut++;
    }

    public void ekle(int veri, int index) {
        
        if (boyut==kapasite) {
            dizi_genislet();
        }
        
        for (int i = boyut; i > index; i--) {
            array[i]=array[i-1];
        }
        
        array[index]=veri;
        boyut++;
    }
    
    public void dizi_genislet(){
        //dizinin boyutunu iki katına çıkarır
        int[] newArray=new int[kapasite*2];
        
        //array dizisindeki elemanları newArray e atar
        for (int i = 0; i < kapasite; i++) {
            newArray[i]=array[i];                    
        }
        
        array=newArray;
        
        this.kapasite=kapasite*2;
    }
    
    public void sil() {

    }

    public void sil(int veri) {
        array[boyut]=veri;
        boyut--;
    }

    public void sil_index(int index){
        
        
    }
    
    public int kapasite(){
        return this.kapasite;        
    }
    
    public void temizle(){
        array=new int[kapasite];        
    }
    
    public int uzunluk(){
        return this.boyut;    
    }
    
    
    public static void main(String[] args) {

    }

}

