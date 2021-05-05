
public class Main {
    public static void main(String[] args) {
        //Programming kısmı programlama kategorisi altında oluşturulan kursları temsil ediyor
        
        Programming programming1 = new Programming(
                1,
                "C# + ANGULAR",
                "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip döküman ve duyurularını burdan yapacağız.",
                "Engin Demirog",
                "Ücretsiz",
                "https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/Zk7d1MdoSJ6cEShVbfd0");
        
        Programming programming2 = new Programming(
                2,
                "JAVA + REACT",
                "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip döküman ve duyurularını burdan yapacağız.",
                "Engin Demirog",
                "Ücretsiz",
                "https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/qi4s19xSKCmtaaRUqUFI");
        
        Programming programming3 = new Programming(
                3,
                "Programlamaya Giriş İçin Temel Kurs",
                "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.",
                "Engin Demirog",
                "Ücretsiz",
                "https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/BBLmG3XFTtm8XBTrzg4v");
        
        Programming[] programmings = {programming1,programming2,programming3};
        
        for (Programming programming : programmings) {
            System.out.println("Kurs adı : " + programming.name + "\n"+
                               "Kurs içeriği : " + programming.detail + "\n" +
                               "Eğitmen adı : " + programming.instructor + "\n" +
                               "Kurs ücreti : " + programming.unitPrice );
        }
        
        //Sık Sorulan Sorular kısmının içeriğini temsil ediyor.
        Question question1 = new Question(
                1,
                //Soru
                "Yazılım Geliştirici Yetiştirme Kampı ücretsiz mi olacak?",
                //Cevap -- Diğerlerinde de bu şekilde bu yüzden karışmaması için aralara birer boşluk bıraktım.
                "Evet, ücretsiz olacak.");
        
        Question question2 = new Question(
                2,
                "Yazılım Geliştirici Yetiştirme Kampı nerede yayınlanacak?",
                
                "Kampımız canlı olarak yayınlanacak. Canlı yayın YouTube kanalımda gerçekleşecek. "+
                "Canlı yayın alanına ulaşmak için tıklayınız. Yayın saatini kaçırmamak için " +
                "kanala abone olup hatırlatıcı eklemeyi unutmayınız. Canlı yayın sonrası " +
                "videolar, ödevler ve testler kodlama.io 'da yayınlanacak.");
        
        Question question3 = new Question(
                3,
                "Yazılım Geliştirici Yetiştirme Kampının canlı yayın tarihi ne zaman ve saat kaçta başlayacak?" +
                " Bir canlı yayın süresi ne kadar olacak? Canlı yayın hangi günlerde yapılacak?",
                
                "Canlı yayın balangıç tarihi : 9 Ocak Cumartesi 2021\n" +
                "Canlı yayın saati : 21.00\n" +
                "Canlı yayın süresi : 3 ders saati\n" +
                "Canlı yayın günleri : Çarşamba ve Cumartesi (İlk canlı ders tarihini takip eden her haftanın Çarşamba ve Cumartesi günlerinde devam edecek)");
        
        Question question4 = new Question(
                4,
                "Yazılım Geliştirici Yetiştirme Kamp programı ne kadar sürecek?",
                
                "Ücretsiz olarak vereceğim bu kamp 2 ay boyunca sürecek.");
        
        Question question5 = new Question(
                5,
                "Kamp programında neler olacak?",
                
                "Detaylı kamp programına ulaşmak için bağlantıyı tıklayınız.");
        
        Question question6 = new Question(
                6,
                "Canlı yayın sonrası videolar, ödevler ve testler olacak mı? Olacak ise bunlara nasıl ulaşabilirim? ",
                
                "Evet, canlı yayın sonrası videolar, ödevler ve testler olacak. " +
                "Kodlama.io 'da Yazılım Geliştirici Yetiştirme Kampının " +
                "içinde bulunan ders programınıza ekleyeceğiz.");
       
        Question question7 = new Question(
                7,
                
                "Yazılım Geliştirici Yetiştirme Kampından en büyük verimi nasıl alabilirim? Kamp sırasında neler yapmamı önerirsiniz?",
                
                "1-İki ekranda takip etmeye çalışın. (Bu ekranlardan birinde beni izlerken diğerinde kod yazıp, soru cevap platformumuzdan " +
                "destek alabilirsiniz. Yardımcı ekran tablet, monitör veya evdeki HDMI destekli TV olabilir.)\n" +
                "2-İkinci ekran yoksa? (Bu durumda bilgisayar ekranınızı ikiye bölebilirsiniz. Windows + Sol Yön tuşuyla mevcut ekranı sola, " +
                "Windows + sağ yön tuşu ikilisiyle de mevcut diğer ekranı sağa atabilirsiniz. Öncesinde deneyiniz.)\n" +
                "3-Ne kurmalıyım? (Eğitimin ilk günü için bir şey kurmanız gerekmiyor. Online editör kullanacağız. Repl.it sitesinden bir hesap açmanız yeterlidir." +
                " İkinci gün itibariyle Visual Studio kullanacağız. Sizin için bir kurulum videosu hazırladım.)");
        
        Question question8 = new Question(
                8,
                
                "Yazılım Geliştirici Yetiştirme Kampından en büyük verimi nasıl alabilirim? " + 
                "Yazılım Geliştirici Yetiştirme Kampına katılmadan önce neler yapmamı önerirsiniz?",
                
                "Herhangi bir programlama bilgisi tecrübeniz olması gerekmiyor. Fakat temel programlama tecrübenizin olması büyük avantaj sağlar. " +
                "Bu yüzden aşağıdaki bana ait yine ücretsiz kaynaklara erişiminiz önemlidir.\n" +
                "#Eğer programlama tecrübeniz ve bilginiz hiç yok veya çok az ise tıklayınız,\n" +
                "#Yukarıdaki dersi bitirdim ama biraz daha örneğe ihtiyacım var diyorsanız tıklayınız,\n" +
                "#Temel seviyeden daha iyi durumdayım diyorsanız tıklayınız,\n" +
                "#İleri seviye olmak üzereyim diyorsanız tıklayınız,");
        
        Question question9 = new Question(
                9,
                
                "Canlı yayına katılamayacak kişilerin, dersleri herhangi bir platform üzerinden takip etme, tekrarını izleme gibi bir şansı olacak mı?",
                
                "Evet, canlı yayından sonra kodlama.io 'ya ekleyeceğiz. Katılamadığınız veya tekrar izlemek istediğiniz yayınlara kodlama.io 'dan ulaşabilirsiniz.");
        
        
        Question[] questions = {question1,question2,question3,question4,question5,question6,question7,question8,question9};
        
        for (Question question : questions) {
            System.out.println("SORU : " + question.question + "\n"+
                               "CEVAP : " + question.answer );
        }
        
        
    }
}
