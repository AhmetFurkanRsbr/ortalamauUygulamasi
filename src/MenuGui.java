import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;


public class MenuGui extends JFrame{
   // Ders ders1= new Ders();

    OrtalamaHesapla ortalamaHesapla1=new OrtalamaHesapla();
    private JTabbedPane tabbedPane1;
    private JPanel JP_Menu;
    private JTextField fld_dersIsim;
    private JSpinner spn_Akts;
    private JTextField fld_vize;
    private JTextField fld_final;
    private JTextField fld_vizeEtki;
    private JTextField fld_finalEtki;
    private JTree tree1;
    private JButton btn_ortalamaHesaplaNotKaydet;
    private JButton btn_sistemeKayitEt;
    private JButton btn_cikisYapKullanici;
    private JTextField fld_gno;
    private JTextField fld_yno;
    private JTextField fld_dersGecme100;
    private JTextField fld_dersGecme4;
    private JLabel lbl_yno;
    private JLabel lbl_gno;
    private JLabel lbl_dersGecme100;
    private JLabel lbl_dersGecme4;
    private JLabel lbl_aktifKullanici;
    private JTextField fld_kalanDersSayisi;
    private JLabel lbl_kalanDersSayisi;
    private JPanel tab_ortalama;
    private JPanel tab_kayitliNot;
    private JTextField fld_kayitliDersSayimiz;
    private JPanel tab_dersBilgiGuncelle;
    private JButton btn_dersSil;
    private JButton btn_dersBilgiGuncelle;
    private JComboBox cmbx_guncellenicekDers;
    private JComboBox cmbx_silinecekDers;
    private JTextField fld_eskiDrsIsim;
    private JTextField fld_eskiDrsVize;
    private JTextField fld_eskiFinal;
    private JTextField fld_eskiVizeEtkiO;
    private JTextField fld_yeniDrsIsim;
    private JSpinner spn_eskiAkts;
    private JSpinner spn_yeniAkts;
    private JTextField fld_yeniDrsVize;
    private JTextField fld_yeniDrsFinal;
    private JTextField fld_yeniVizeEtkiO;
    private JTextField fld_yeniFinalEtkiO;
    private JLabel txt_eskiDrsIsim;
    private JLabel txt_eskiDrsAkts;
    private JLabel txt_eskiDrsVize;
    private JLabel txt_eskiDrsFinal;
    private JLabel txt_eskiVizeEtki;
    private JLabel txt_eskiFinalEtki;
    private JLabel txt_yeniDrsIsim;
    private JLabel txt_yeniDrsAkts;
    private JLabel txt_yeniDrsVize;
    private JLabel txt_yeniDrsFinal;
    private JLabel txt_yeniVizeEtki;
    private JLabel txt_yeniFinalEtki;
    private JTextField fld_silmeDersIsim;
    private JTextField fld_silmeAkts;
    private JTextField fld_silmeVizeNotu;
    private JTextField fld_silmeFinalNotu;
    private JTextField fld_silmeVizeEtkiO;
    private JTextField fld_EskiFinalEtkiOranı;
    private JTextField fld_silmeFinalEtkiO;
    private JLabel txt_silmeDersIsim;
    private JLabel txt_silmeAkts;
    private JLabel txt_silmeVizeNotu;
    private JLabel txt_silmeFinalNotu;
    private JLabel txt_silmeVizeEtkiO;
    private JLabel txt_silmeFinalEtkiO;
    private JComboBox cmbx_derslerEnyksk;
    private JTextField fld_dersiAlanSayisi;
    private JTextField fld_enyAlanKisi;
    private JTextField fld_enyNot;
    private JButton btn_sorgulaEnyksk;
    private JTextField fld_enyFalanToplamKisiSayisi;
    private JTextField fld_enyFalanKisi;
    private JTextField fld_enyFfinalNot;
    private JTextField fld_dersIsimKayit;
    private JTextField fld_aktsKayit;
    private JTextField fld_vizeNotKayit;
    private JTextField fld_finalNotKayit;
    private JTextField fld_vizeEtkiKayit;
    private JTextField fld_dersOrt100Kayit;
    private JTextField fld_derstenGecme4Kayit;
    private JLabel txt_dersIsimKayit;
    private JLabel txt_aktsKayit;
    private JLabel txt_vizeKayit;
    private JLabel txt_finalKayit;
    private JLabel txt_vizeEtkiOKayit;
    private JLabel txt_dersOrtalamaKayit;
    private JLabel txt_derstengecmeKayit;
    private JButton btn_hesabimiSil;
    private JSpinner spn_donem;
    private JLabel txt_donem;
    private JTextField fld_EskiYno;
    private JLabel lbl_eskiyno;
    private JTextField fld_Eskigno;
    private JLabel lbl_eskigno;
    private JTextField fld_anlikGnoKayit;
    private JLabel txt_anlıkGnoKayit;
    private JButton btn_gnoEkle;
    private JTextField fld_gnoGercerliDonem;
    private JLabel txt_gnoGecerliDonem;
    private JButton btn_gnoDegis;
    private JPanel tab_ortalamaDene;
    private JPanel tab_enyuksekAlinanNot;
    private JPanel tab_dersSil;
    private JTextField fld_vizeBasariSirasi;
    private JTextField fld_finalBasariSirasi;
    private JTextField fld_vizeNotun;
    private JTextField fld_finalNotun;
    private JLabel txt_vizeBasariSirasi;
    private JLabel txt_finalBasariSirasi;
    private JLabel txt_vizeNotun;
    private JLabel txt_finalNotun;
    private JLabel txt_vizeBasariSirasiPaylastigi;
    private JTextField fld_vizeBasariSirasiPaylastigi;
    private JLabel txt_finalBasariSirasiPaylastigi;
    private JTextField fld_finalBasariSirasiPaylastigi;
    private JLabel txt_sinifVizeOrt;
    private JTextField fld_sinifVizeOrt;
    private JLabel txt_sinifFinalOrt;
    private JTextField fld_sinifFinalOrt;
    private JTextField fld_sinifDersGenelOrt;
    private JTextField fld_kisiDersGenelOrt;
    private JLabel txt_sinifDersGenelOrt;
    private JLabel txt_kisiDersGenelOrt;
    private JTextField fld_dersGenelBirincisi;
    private JTextField fld_dersGenelBasariSiralaman;
    private JLabel txt_dersGenelBirinci;
    private JLabel txt_dersGenelBasariSiran;
    private JLabel txt_dersGenelEnYuksekOrt;
    private JTextField fld_dersGenelEnyOrt;
    private JLabel txt_dersiAlanKisiSayisi;
    private JTextField fld_derstenGecenKisiSayisi;
    private JTextField fld_derstenKalanKisiSayisi;
    private JLabel txt_derstenGecenKisiSayis;
    private JLabel txt_derstenKalanKisiSayis;
    private JCheckBox chckbx_rastgeleDersler;
    private JCheckBox chckbx_kayitliDersler;
    private JSpinner spn_getirilecekDonem;
    private JButton btn_hesaplaOrtalamaDene;
    private JTextField fld_vize1;
    private JTextField fld_final1;
    private JTextField fld_vizeEtki1;
    private JButton btn_dersleriGetir;
    private JTextField fld_vize2;
    private JTextField fld_vize3;
    private JTextField fld_vize4;
    private JTextField fld_vize5;
    private JTextField fld_vize6;
    private JTextField fld_vize7;
    private JTextField fld_vize8;
    private JTextField fld_vize9;
    private JTextField fld_vize10;
    private JTextField fld_vize11;
    private JTextField fld_final2;
    private JTextField fld_final3;
    private JTextField fld_final4;
    private JTextField fld_final5;
    private JTextField fld_final6;
    private JTextField fld_final7;
    private JTextField fld_final8;
    private JTextField fld_final9;
    private JTextField fld_final10;
    private JTextField fld_final11;
    private JTextField fld_vizeEtki2;
    private JTextField fld_vizeEtki3;
    private JTextField fld_vizeEtki4;
    private JTextField fld_vizeEtki5;
    private JTextField fld_vizeEtki6;
    private JTextField fld_vizeEtki7;
    private JTextField fld_vizeEtki8;
    private JTextField fld_vizeEtki9;
    private JTextField fld_vizeEtki10;
    private JTextField fld_vizeEtki11;
    private JTextField fld_finalEtki1;
    private JTextField fld_finalEtki2;
    private JTextField fld_finalEtki3;
    private JTextField fld_finalEtki4;
    private JTextField fld_finalEtki5;
    private JTextField fld_finalEtki6;
    private JTextField fld_finalEtki7;
    private JTextField fld_finalEtki8;
    private JTextField fld_finalEtki9;
    private JTextField fld_finalEtki10;
    private JTextField fld_finalEtki11;
    private JLabel txt_hangiDonem;
    private JSpinner spn_aktsDers1;
    private JSpinner spn_aktsDers2;
    private JSpinner spn_aktsDers3;
    private JSpinner spn_aktsDers4;
    private JSpinner spn_aktsDers5;
    private JSpinner spn_aktsDers6;
    private JSpinner spn_aktsDers7;
    private JSpinner spn_aktsDers8;
    private JSpinner spn_aktsDers9;
    private JSpinner spn_aktsDers10;
    private JSpinner spn_aktsDers11;
    private JPanel jp_checkboxlar;
    private JLabel txt_vizeEtkiOrani;
    private JLabel txt_finalNotu;
    private JLabel txt_vizeNotu;
    private JLabel txt_akts;
    private JLabel txt_dersIsim;
    private JScrollPane scrool_ortalamaDene;
    private JTextField txt_dersIsim1;
    private JTextField txt_dersIsim3;
    private JTextField txt_dersIsim4;
    private JTextField txt_dersIsim2;
    private JTextField txt_dersIsim5;
    private JTextField txt_dersIsim6;
    private JTextField txt_dersIsim7;
    private JTextField txt_dersIsim8;
    private JTextField txt_dersIsim9;
    private JTextField txt_dersIsim10;
    private JTextField txt_dersIsim11;
    private JLabel txt_kacDersHesaplanicak;
    private JSpinner spn_hesaplanicakDersSayisi;
    private JLabel txt_finaltkiOrani;
    private JTextField fld_sinavNotunaGoreOrt;
    private JLabel lbl_sinavNotunaGoreOrt;
    private JTextField fld_finalEtkiKayit;
    private JLabel txt_finalEtkiOKayit;
    private JTextField fld_derstenGecmeDurumuKayit;
    private JLabel txt_derstenGecmeDurumuKayit;
    private JTextField fld_verildigiDonemKayit;
    private JLabel txt_verildigiDonemKayit;
    private JLabel txt_kayitliDersSayisiKayit;
    private JLabel txt_harfNotuKayit;
    private JTextField fld_harfNotuKayit;
    private JLabel lbl_harfNotu;
    private JTextField fld_harfNotu;
    private JTextField fld_eskiGnoOrtDene;
    private JCheckBox chckbx_harfNotuGirisi;
    private JCheckBox chckbx_100lukNotGirisi;
    private JLabel txt_harfNotuOrtDene;
    private JComboBox cmbx_harfNotu1;
    private JComboBox cmbx_harfNotu2;
    private JComboBox cmbx_harfNotu3;
    private JComboBox cmbx_harfNotu4;
    private JComboBox cmbx_harfNotu5;
    private JComboBox cmbx_harfNotu6;
    private JComboBox cmbx_harfNotu7;
    private JComboBox cmbx_harfNotu8;
    private JComboBox cmbx_harfNotu9;
    private JComboBox cmbx_harfNotu10;
    private JComboBox cmbx_harfNotu11;
    private JLabel lbl_eskiGnoOrtDene;
    private JSpinner spn_yeniDonem;
    private JSpinner spn_eskiDonem;
    private JLabel txt_eskiDonem;
    private JLabel txt_yeniDonem;

    ArrayList<Component> temizlenecekComponent = new ArrayList<>();
    ArrayList<JTextField> dersIsimleriOrtalamaDene=new ArrayList<>();
    ArrayList<JTextField> vizeNotlariOrtalamaDene=new ArrayList<>();
    ArrayList<JTextField> finalNotlariOrtalamaDene=new ArrayList<>();
    ArrayList<JSpinner> aktslerOrtalamaDene=new ArrayList<>();
    ArrayList<JTextField> vizeEtkiOranlariOrtalamaDene=new ArrayList<>();
    ArrayList<JTextField> finalEtkiOranlariOrtalamaDene=new ArrayList<>();
    ArrayList<JComboBox> harfNotlariOrtalamaDene=new ArrayList<>();
    ArrayList<Integer> vizeNotlariOrtalamaDeneIntAR = new ArrayList<>();
    ArrayList<Integer> finalNotlariOrtalamaDeneIntAR = new ArrayList<>();
    ArrayList<Integer> aktslerOrtalamaDeneIntAR = new ArrayList<>();
    ArrayList<Integer> vizeEtkiOranlariOrtalamaDeneIntAR = new ArrayList<>();
    ArrayList<Integer> finalEtkiOranlariOrtalamaDeneIntAR = new ArrayList<>();
    ArrayList<String> kisiDonemdekiDersIsimleriAROrtDene = new ArrayList<>();
    ArrayList<String> harfNotlariDonemdekiAROrtDene = new ArrayList<>();

    DefaultComboBoxModel<String> harfNotuModel1 = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> harfNotuModel2 = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> harfNotuModel3 = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> harfNotuModel4 = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> harfNotuModel5 = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> harfNotuModel6 = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> harfNotuModel7 = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> harfNotuModel8 = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> harfNotuModel9 = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> harfNotuModel10 = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> harfNotuModel11 = new DefaultComboBoxModel<>();


    DefaultMutableTreeNode node=new DefaultMutableTreeNode("Dersler");
    DefaultMutableTreeNode node1=new DefaultMutableTreeNode("Dönem 1");
    DefaultMutableTreeNode node2=new DefaultMutableTreeNode("Dönem 2");
    DefaultMutableTreeNode node3=new DefaultMutableTreeNode("Dönem 3");
    DefaultMutableTreeNode node4=new DefaultMutableTreeNode("Dönem 4");
    DefaultMutableTreeNode node5=new DefaultMutableTreeNode("Dönem 5");
    DefaultMutableTreeNode node6=new DefaultMutableTreeNode("Dönem 6");
    DefaultMutableTreeNode node7=new DefaultMutableTreeNode("Dönem 7");
    DefaultMutableTreeNode node8=new DefaultMutableTreeNode("Dönem 8");
    DefaultMutableTreeNode node9=new DefaultMutableTreeNode("Dönem 9");
    DefaultMutableTreeNode node10=new DefaultMutableTreeNode("Dönem 10");
    DefaultMutableTreeNode node11=new DefaultMutableTreeNode("Dönem 11");
    DefaultMutableTreeNode[] donemNodeler = {node1,node2,node3,node4,node5,node6,node7,node8,node9,node10,node11};


    Object [] harfNotuModel = {harfNotuModel1,harfNotuModel2,harfNotuModel3,harfNotuModel4,harfNotuModel5,harfNotuModel6,harfNotuModel7,harfNotuModel8,harfNotuModel9,harfNotuModel10,harfNotuModel11} ;

    static String ortalamaHesaplanicakNotTipi="100luk";
    static int dersSayisi = 0;
    static String dersSayisiString="";
    static int finalNotu=0;
    static int vizeNotu=0;
    static int vizeEtkiOrani=0;
    static int finalEtkiOrani=0;
    static int akts=0;
    static int donem=0;
    static int dersSayisiIndex = 1;
    static int getirilenDonemdekiDersSayisi=0;
    ArrayList<Integer> derstenGecmeNotlari100lukOrtDene=new ArrayList<>();
    boolean isNotGirisindeHata=false;
    String cmbxSilinecekDersIsim;
    String cmbxguncellenicekDersIsim;
    String cmbxEnyuksekDersIsim;
    String eskiGnoKayit;
    int eskiGecerliDonem;
    String gnoGecerliDonemSt ="";
    Float eskiGnoOrtDene=0.00f;
    boolean harfAyarlandi=false;

VeriTabaniIslemleri vt= new  VeriTabaniIslemleri();
SilinenVerileriKaydirma silVerKaydir =new SilinenVerileriKaydirma();

    private static void addNumericKeyListenerToAllTextFields(Container container) {
        for (Component component : container.getComponents()) {

            if (component instanceof JTextField) {
                ((JTextField) component).addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar();
                        // Eğer karakter rakam değilse, işlem yapma


                       if (component.getName().startsWith("numberVeNokta") &&  !( ((JTextField) component).getText().contains(".")) ){

                           if (!Character.isDigit(c) && component.getName()!=null  && component.getName().startsWith("number") &&  !Character.toString(c).equals(".")) {
                               e.consume(); // İşlemi iptal et
                           }
                       }else if (!Character.isDigit(c) && component.getName()!=null  &&component.getName().startsWith("number") ) {
                            e.consume(); // İşlemi iptal et
                        }
                    }
                });
            } else if (component instanceof Container) {
                // Eğer bileşen başka bir Container ise, bu metod ile devam et
                addNumericKeyListenerToAllTextFields((Container) component);
            }
        }
    }

    void gnoKayitEkle() {
         boolean isHataYok=false;
        while (!isHataYok) {
            try {
                if (fld_anlikGnoKayit.getText().isEmpty() || fld_anlikGnoKayit.getText().startsWith("0") || fld_gnoGercerliDonem.getText().isEmpty() || fld_gnoGercerliDonem.getText().startsWith("0")) {
                    System.out.println("gno ekleme başlatıldı");

                    tamEkranYap(false);
                    String gnoKayitString = JOptionPane.showInputDialog(this, "Şuanki Gno'nuz Nedir ?(!!ondalık kısım için . kullanınız!!) ");
                    tamEkranYap(true);

                    float gnoKayit = Float.parseFloat(gnoKayitString);
                    if (gnoKayit < 0.0 || gnoKayit > 4.0) {
                        isHataYok = false;
                        tamEkranYap(false);
                        JOptionPane.showMessageDialog(this, "Gno'nuz 0.00-4.00 Arasında Olmalıdır !!");
                        tamEkranYap(true);


                    } else {
                        fld_anlikGnoKayit.setText(gnoKayitString);
                        tamEkranYap(false);
                        gnoGecerliDonemSt = JOptionPane.showInputDialog(null, "Gno'nuzun Geçerli Olduğu Son Dönemi Giriniz(1-2-3)");
                        tamEkranYap(true);
                        int gnoGecerliDonem = Integer.parseInt(gnoGecerliDonemSt);

                        if (gnoGecerliDonem <= 0 || 30 < gnoGecerliDonem) {
                            isHataYok = false;
                            tamEkranYap(false);
                            JOptionPane.showMessageDialog(null, "Gno'nuzun Geçerli Olduğu Son Dönem 1 - 30 Arasında Olmalıdır !!");
                            tamEkranYap(true);

                        } else {

                            fld_gnoGercerliDonem.setText(gnoGecerliDonemSt);
                            tamEkranYap(true);
                            vt.sistemeGnoEkle(AktifKullanici.aktifKullaniciID, fld_anlikGnoKayit.getText(), fld_gnoGercerliDonem.getText());
                            isHataYok = true;
                        }

                    }

                } else if (!(fld_gnoGercerliDonem.getText().isEmpty() || fld_gnoGercerliDonem.getText().startsWith("0"))) {
                    tamEkranYap(false);
                    JOptionPane.showMessageDialog(null, "Zaten Sistemde Gno Kaydınız Var.... Gno Güncelle Kısmını Kullanınınz !!");
                    tamEkranYap(true);
                    isHataYok = true;
                }
            }catch (NumberFormatException k){
                tamEkranYap(false);
                JOptionPane.showMessageDialog(null,"Gno'nuz 0.00-4.00 Arasında Olmalıdır !!");
                tamEkranYap(true);
                System.out.println("gno kısmına sayı girilmedi "+k.getMessage());
                isHataYok=false;
            }catch (NullPointerException e ){
                tamEkranYap(false);
                JOptionPane.showMessageDialog(null,"İlk girişte gno girmeniz zorunludur.");
                tamEkranYap(true);
                System.out.println("null geldiği için gno kayıt ekle kısmında hata : "+e.getMessage());
                isHataYok=false;
            }
        }
    }

    int kayitliDersBilgileriniGetir(int bilgisiGetirilicekDonem,String ortalamaHesaplanicakNotTipi){

        dersIsimleriOrtalamaDene.clear();
        vizeNotlariOrtalamaDene.clear();
        finalNotlariOrtalamaDene.clear();
        vizeEtkiOranlariOrtalamaDene.clear();
        finalEtkiOranlariOrtalamaDene.clear();
        aktslerOrtalamaDene.clear();
       // harfNotlariOrtalamaDene.clear();

        getirilenDonemdekiDersSayisi = vt.kisininDonemdekiDersSayisiniGetir(bilgisiGetirilicekDonem);
        kisiDonemdekiDersIsimleriAROrtDene = vt.kisininDonemdekiDersIsimleriniGetir(bilgisiGetirilicekDonem,getirilenDonemdekiDersSayisi,kisiDonemdekiDersIsimleriAROrtDene);

        if(ortalamaHesaplanicakNotTipi.equals("100luk")){
            vizeNotlariOrtalamaDeneIntAR=vt.kisininDonemdekiDersVerisiniGetir(bilgisiGetirilicekDonem,getirilenDonemdekiDersSayisi,vizeNotlariOrtalamaDeneIntAR,"vize");
            finalNotlariOrtalamaDeneIntAR=vt.kisininDonemdekiDersVerisiniGetir(bilgisiGetirilicekDonem,getirilenDonemdekiDersSayisi,finalNotlariOrtalamaDeneIntAR,"final");
            vizeEtkiOranlariOrtalamaDeneIntAR=vt.kisininDonemdekiDersVerisiniGetir(bilgisiGetirilicekDonem,getirilenDonemdekiDersSayisi,vizeEtkiOranlariOrtalamaDeneIntAR,"vizeEtki");
            finalEtkiOranlariOrtalamaDeneIntAR=vt.kisininDonemdekiDersVerisiniGetir(bilgisiGetirilicekDonem,getirilenDonemdekiDersSayisi,finalEtkiOranlariOrtalamaDeneIntAR,"finalEtki");
        }else {
            harfNotlariDonemdekiAROrtDene=vt.kisininDonemdekiDonemdekiHarfNotlariniGetir(bilgisiGetirilicekDonem,getirilenDonemdekiDersSayisi,harfNotlariDonemdekiAROrtDene);
        }
        aktslerOrtalamaDeneIntAR=vt.kisininDonemdekiDersVerisiniGetir(bilgisiGetirilicekDonem,getirilenDonemdekiDersSayisi,aktslerOrtalamaDeneIntAR,"akts");

        System.out.println("burda girdim");
        dersKutulariniGetirOrtDene(getirilenDonemdekiDersSayisi,ortalamaHesaplanicakNotTipi);

        dersSayisinaGoreDizileriOlustur(getirilenDonemdekiDersSayisi,"dersIsim");
        dersSayisinaGoreDizileriOlustur(getirilenDonemdekiDersSayisi,"akts");
        if(ortalamaHesaplanicakNotTipi.equals("100luk")){

        dersSayisinaGoreDizileriOlustur(getirilenDonemdekiDersSayisi,"vize");
        dersSayisinaGoreDizileriOlustur(getirilenDonemdekiDersSayisi,"final");
        dersSayisinaGoreDizileriOlustur(getirilenDonemdekiDersSayisi,"vizeEtki");
        dersSayisinaGoreDizileriOlustur(getirilenDonemdekiDersSayisi,"finalEtki");

        }else {
            dersSayisinaGoreDizileriOlustur(getirilenDonemdekiDersSayisi,"dersHarfNotu");
        }

        kayitliDersleriKutularaDoldurOrtDene(getirilenDonemdekiDersSayisi,ortalamaHesaplanicakNotTipi);
       return getirilenDonemdekiDersSayisi;
    }

    void ortalamaDeneSyfDersleriGetir(boolean isRastgeleDersleriGetir,int DersSayisi){

        if (chckbx_100lukNotGirisi.isSelected()){
            ortalamaHesaplanicakNotTipi="100luk";
        }else{
            ortalamaHesaplanicakNotTipi="harf";
        }

        if (isRastgeleDersleriGetir){

           dersKutulariniGizleOrtDene();
           dersKutulariniGetirOrtDene(DersSayisi,ortalamaHesaplanicakNotTipi);

        }else {

            dersKutulariniGizleOrtDene();
            DersSayisi=kayitliDersBilgileriniGetir((int)spn_getirilecekDonem.getValue(),ortalamaHesaplanicakNotTipi);

        }

    }
    void spinnerLimitle(){

         int minDeger =1;
         float aktifDegilkenkiDeger=1.1f;
         int maxDeger =30;
         int minDeger2 =1;
         int maxDeger2 =20;

         SpinnerModel spinnerModelAktsNotKaydet = new SpinnerNumberModel(minDeger,minDeger,maxDeger,1);
         SpinnerModel spinnerModel2 = new SpinnerNumberModel(minDeger2,minDeger2,maxDeger2,1);

         spn_Akts.setModel(spinnerModelAktsNotKaydet);
         spn_donem.setModel(spinnerModel2);

        SpinnerModel spinnerModelAktsOrtHesaplaDers1 = new SpinnerNumberModel(minDeger,minDeger,maxDeger,1);
        SpinnerModel spinnerModelAktsOrtHesaplaDers2 = new SpinnerNumberModel(minDeger,minDeger,maxDeger,1);
        SpinnerModel spinnerModelAktsOrtHesaplaDers3 = new SpinnerNumberModel(minDeger,minDeger,maxDeger,1);
        SpinnerModel spinnerModelAktsOrtHesaplaDers4 = new SpinnerNumberModel(minDeger,minDeger,maxDeger,1);
        SpinnerModel spinnerModelAktsOrtHesaplaDers5 = new SpinnerNumberModel(minDeger,minDeger,maxDeger,1);
        SpinnerModel spinnerModelAktsOrtHesaplaDers6 = new SpinnerNumberModel(minDeger,minDeger,maxDeger,1);
        SpinnerModel spinnerModelAktsOrtHesaplaDers7 = new SpinnerNumberModel(minDeger,minDeger,maxDeger,1);
        SpinnerModel spinnerModelAktsOrtHesaplaDers8 = new SpinnerNumberModel(minDeger,minDeger,maxDeger,1);
        SpinnerModel spinnerModelAktsOrtHesaplaDers9 = new SpinnerNumberModel(minDeger,minDeger,maxDeger,1);
        SpinnerModel spinnerModelAktsOrtHesaplaDers10 = new SpinnerNumberModel(minDeger,minDeger,maxDeger,1);
        SpinnerModel spinnerModelAktsOrtHesaplaDers11 = new SpinnerNumberModel(minDeger,minDeger,maxDeger,1);
        SpinnerModel spinnerModelOrtHesaplaDonem = new SpinnerNumberModel(1,1,18,1);
        SpinnerModel spinnerModelOrtHesaplaDersSayisi = new SpinnerNumberModel(1,1,11,1);

         spn_aktsDers1.setModel(spinnerModelAktsOrtHesaplaDers1);
         spn_aktsDers2.setModel(spinnerModelAktsOrtHesaplaDers2);
         spn_aktsDers3.setModel(spinnerModelAktsOrtHesaplaDers3);
         spn_aktsDers4.setModel(spinnerModelAktsOrtHesaplaDers4);
         spn_aktsDers5.setModel(spinnerModelAktsOrtHesaplaDers5);
         spn_aktsDers6.setModel(spinnerModelAktsOrtHesaplaDers6);
         spn_aktsDers7.setModel(spinnerModelAktsOrtHesaplaDers7);
         spn_aktsDers8.setModel(spinnerModelAktsOrtHesaplaDers8);
         spn_aktsDers9.setModel(spinnerModelAktsOrtHesaplaDers9);
         spn_aktsDers10.setModel(spinnerModelAktsOrtHesaplaDers10);
         spn_aktsDers11.setModel(spinnerModelAktsOrtHesaplaDers11);
         spn_getirilecekDonem.setModel(spinnerModelOrtHesaplaDonem);
         spn_hesaplanicakDersSayisi.setModel(spinnerModelOrtHesaplaDersSayisi);

         //Spinner a text tipinden yazı yazılmasını engelleyen kısım(akts değerini sadece arttırma eksilme yapılmasına izin veriyor)
         JComponent editor = spn_Akts.getEditor();
         if (editor instanceof JSpinner.DefaultEditor) {
             JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editor;
             spinnerEditor.getTextField().setEditable(false);
         }
        JComponent editor1 = spn_donem.getEditor();
        if (editor instanceof JSpinner.DefaultEditor) {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editor1;
            spinnerEditor.getTextField().setEditable(false);
        }
        JComponent editorOrtKaydetAktsDers1 = spn_aktsDers1.getEditor();
        if (editorOrtKaydetAktsDers1 instanceof JSpinner.DefaultEditor) {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editorOrtKaydetAktsDers1;
            spinnerEditor.getTextField().setEditable(false);
        }
        JComponent editorOrtKaydetAktsDers2 = spn_aktsDers2.getEditor();
        if (editorOrtKaydetAktsDers2 instanceof JSpinner.DefaultEditor) {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editorOrtKaydetAktsDers2;
            spinnerEditor.getTextField().setEditable(false);
        }
        JComponent editorOrtKaydetAktsDers3 = spn_aktsDers3.getEditor();
        if (editorOrtKaydetAktsDers3 instanceof JSpinner.DefaultEditor) {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editorOrtKaydetAktsDers3;
            spinnerEditor.getTextField().setEditable(false);
        }
        JComponent editorOrtKaydetAktsDers4 = spn_aktsDers4.getEditor();
        if (editorOrtKaydetAktsDers4 instanceof JSpinner.DefaultEditor) {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editorOrtKaydetAktsDers4;
            spinnerEditor.getTextField().setEditable(false);
        }
        JComponent editorOrtKaydetAktsDers5 = spn_aktsDers5.getEditor();
        if (editorOrtKaydetAktsDers5 instanceof JSpinner.DefaultEditor) {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editorOrtKaydetAktsDers5;
            spinnerEditor.getTextField().setEditable(false);
        }
        JComponent editorOrtKaydetAktsDers6 = spn_aktsDers6.getEditor();
        if (editorOrtKaydetAktsDers6 instanceof JSpinner.DefaultEditor) {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editorOrtKaydetAktsDers6;
            spinnerEditor.getTextField().setEditable(false);
        }
        JComponent editorOrtKaydetAktsDers7 = spn_aktsDers7.getEditor();
        if (editorOrtKaydetAktsDers7 instanceof JSpinner.DefaultEditor) {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editorOrtKaydetAktsDers7;
            spinnerEditor.getTextField().setEditable(false);
        }
        JComponent editorOrtKaydetAktsDers8 = spn_aktsDers8.getEditor();
        if (editorOrtKaydetAktsDers8 instanceof JSpinner.DefaultEditor) {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editorOrtKaydetAktsDers8;
            spinnerEditor.getTextField().setEditable(false);
        }
        JComponent editorOrtKaydetAktsDers9 = spn_aktsDers9.getEditor();
        if (editorOrtKaydetAktsDers9 instanceof JSpinner.DefaultEditor) {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editorOrtKaydetAktsDers9;
            spinnerEditor.getTextField().setEditable(false);
        }
        JComponent editorOrtKaydetAktsDers10 = spn_aktsDers10.getEditor();
        if (editorOrtKaydetAktsDers10 instanceof JSpinner.DefaultEditor) {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editorOrtKaydetAktsDers10;
            spinnerEditor.getTextField().setEditable(false);
        }
        JComponent editorOrtKaydetAktsDers11 = spn_aktsDers11.getEditor();
        if (editorOrtKaydetAktsDers11 instanceof JSpinner.DefaultEditor) {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editorOrtKaydetAktsDers11;
            spinnerEditor.getTextField().setEditable(false);
        }
        JComponent editorOrtKaydetDonem = spn_getirilecekDonem.getEditor();
        if (editorOrtKaydetDonem instanceof JSpinner.DefaultEditor) {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editorOrtKaydetDonem;
            spinnerEditor.getTextField().setEditable(false);
        }
        JComponent editorOrtKaydetDersSayisi = spn_hesaplanicakDersSayisi.getEditor();
        if (editorOrtKaydetDersSayisi instanceof JSpinner.DefaultEditor) {
            JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) editorOrtKaydetDersSayisi;
            spinnerEditor.getTextField().setEditable(false);
        }


     }
    void ortalamaSonucuGorunurYap(boolean aktifBilgiGirmeDevam){
        if(!aktifBilgiGirmeDevam){
            /*
            fld_yno.setVisible(false);
            fld_gno.setVisible(false);
            fld_yno.setVisible(false);
            fld_gno.setVisible(false);
            lbl_yno.setVisible(false);
            lbl_gno.setVisible(false);
           */
           // lbl_sinavNotunaGoreOrt.setVisible(true);
           // fld_sinavNotunaGoreOrt.setVisible(true);
            fld_yno.setVisible(true);
            fld_gno.setVisible(true);
            lbl_yno.setVisible(true);
            lbl_gno.setVisible(true);
            lbl_yno.setVisible(true);
            lbl_gno.setVisible(true);
            lbl_eskigno.setVisible(true);
            lbl_eskiyno.setVisible(true);
            fld_Eskigno.setVisible(true);
            fld_EskiYno.setVisible(true);


            fld_dersGecme100.setVisible(true);
            fld_dersGecme4.setVisible(true);
            fld_harfNotu.setVisible(true);

            lbl_harfNotu.setVisible(true);
            lbl_dersGecme4.setVisible(true);
            lbl_dersGecme100.setVisible(true);
        }

    }

    void ortalamaSonucuGizle(){
        lbl_sinavNotunaGoreOrt.setVisible(false);
        fld_sinavNotunaGoreOrt.setVisible(false);

        lbl_eskigno.setVisible(false);
        lbl_eskiyno.setVisible(false);
        fld_Eskigno.setVisible(false);
        fld_EskiYno.setVisible(false);

        fld_yno.setVisible(false);
        fld_gno.setVisible(false);
        fld_dersGecme100.setVisible(false);
        fld_dersGecme4.setVisible(false);
        fld_harfNotu.setVisible(false);

        lbl_harfNotu.setVisible(false);
        lbl_dersGecme4.setVisible(false);
        lbl_gno.setVisible(false);
        lbl_yno.setVisible(false);
        lbl_dersGecme100.setVisible(false);


    }
    void agacListeAyarla(){
        if(!vt.baglanmaDurumu){
            try {
                vt.msqlBaglan();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        node.removeAllChildren();
        for (DefaultMutableTreeNode donemNode:donemNodeler){
            donemNode.removeAllChildren();
        }
        vt.cekilenDersDonem1.clear();
        vt.kisininKayitliDersleriniGetir();
         fld_kayitliDersSayimiz.setText(""+AktifKullanici.aktifKullaniciDersSayi);
        if(vt.kisininKayitliDersGetirmeDurumu){

            DefaultMutableTreeNode[] dersIsimleriNode = new DefaultMutableTreeNode[AktifKullanici.aktifKullaniciDersSayi];

            DefaultTreeModel model1=new DefaultTreeModel(node);

            int index=0;
            for (int donem:vt.cekilenDersDonem1){
                //System.out.println(index+" : "+donem);
                vt.cekilenDersDonem[index]=donem;
                index++;
            }


            for (int i=1;i<12;i++){
                for (int m=0;m<vt.cekilenDersDonem.length;m++){
                    if(vt.cekilenDersDonem[m]==i && vt.cekilenDersDonem[m]!=0 ){
                        if(vt.cekilenDersDonem[m]==0){
                            break;
                        }else if (!node.isNodeChild(donemNodeler[i-1])){
                            node.add(donemNodeler[i-1]);
                           // System.out.println("eklenen donem: "+donemNodeler[i-1]);
                        }

                    }
                }

            }
           // node.add(node2);


            for (int k=0;k<vt.cekilenDersDonem1.size();k++) {
                for (int j=0;j<AktifKullanici.aktifKullaniciDersSayi;j++){
                    if (vt.cekilenDersDonem[k] == vt.dersDonemBilgisiGetir(vt.cekilenDers[j]) && vt.cekilenDersDonem[k] !=0){
                        dersIsimleriNode[j] = new DefaultMutableTreeNode("" + vt.cekilenDers[j]);

                        for (int m=0;m<donemNodeler.length;m++){
                            if (vt.cekilenDersDonem[k]==m+1){
                                donemNodeler[m].add(dersIsimleriNode[j]);
                            }
                        }
                       // System.out.println("k: "+k+" --j: "+j+" **dönem: "+vt.cekilenDersDonem[k]+" -> ders ismi: "+dersIsimleriNode[j]);
                    } else if (vt.cekilenDersDonem[k]==0) {
                        break;
                    }
                }
            }
            tree1.setModel(model1);
        }
    }

    void cmbx_EnYuksekGonder() {
        cmbx_derslerEnyksk.removeAll();

        DefaultComboBoxModel<String> guncellenicekEnYModel = new DefaultComboBoxModel<>();
        cmbx_derslerEnyksk.setModel(guncellenicekEnYModel);

        for (int z = 0; z < AktifKullanici.aktifKullaniciDersSayi; z++) {
            cmbxEnyuksekDersIsim = vt.cekilenDers[z];
            guncellenicekEnYModel.addElement(cmbxEnyuksekDersIsim);
        }
    }
    void cmbx_guncellenicekDersGonder(){
        cmbx_guncellenicekDers.removeAll();
        DefaultComboBoxModel<String> guncellenicekModel = new DefaultComboBoxModel<>();
        cmbx_guncellenicekDers.setModel(guncellenicekModel);

        for (int m=0;m<AktifKullanici.aktifKullaniciDersSayi;m++){
            cmbxguncellenicekDersIsim = vt.cekilenDers[m];
            guncellenicekModel.addElement(cmbxguncellenicekDersIsim);
        }

    }
    void cmbx_silinecekDersGonder(){
        cmbx_silinecekDers.removeAll();

        DefaultComboBoxModel<String> silinecekModel = new DefaultComboBoxModel<>();
        cmbx_silinecekDers.setModel(silinecekModel);
        for (int k=0;k<AktifKullanici.aktifKullaniciDersSayi;k++){
            cmbxSilinecekDersIsim = vt.cekilenDers[k];
            silinecekModel.addElement(cmbxSilinecekDersIsim);
        }

    }
    void cmbx_harfNotuAyarlaGetir(){

        String []okulunHarfNotlari = new String[14];
        int  okuldakiHarfSayisi = OkulHarfNotlari.okulununHarfNotlariniAktar(AktifKullanici.aktifKullaniciOkul);
        okulunHarfNotlari =OkulHarfNotlari.okulununHarfNotlari;

        String harfNotu="";



       int m=0;
       for (JComboBox comboBoxDersNotu:harfNotlariOrtalamaDene){
            if(m>=11){
                break;
            }else {
                comboBoxDersNotu.setModel((DefaultComboBoxModel) harfNotuModel[m]);
                m++;
            }

        }

       for (int n=0;n<11;n++){
        for (int z = 0; z < okuldakiHarfSayisi; z++) {
            harfNotu = okulunHarfNotlari[z] ;
           // System.out.println("harf notu: "+harfNotu);
            DefaultComboBoxModel harfNtModel = new DefaultComboBoxModel();
            harfNtModel=(DefaultComboBoxModel) harfNotuModel[n];
             harfNtModel.addElement(harfNotu);
        }
           System.out.println(harfNotuModel.length);
       }
       harfAyarlandi=true;

        /*
        System.out.println(harfNotlariOrtalamaDene.get(3).getName());
        System.out.println(harfNotlariOrtalamaDene.get(3).getModel());
        System.out.println(harfNotlariOrtalamaDene.get(3).getModel().getElementAt(3));

         */
    }

    void guncellenicekSayfasindakileriGizle(){
        txt_eskiDrsIsim.setVisible(false);
        txt_eskiDrsAkts.setVisible(false);
        txt_eskiDrsVize.setVisible(false);
        txt_eskiDrsFinal.setVisible(false);
        txt_eskiVizeEtki.setVisible(false);
        txt_eskiFinalEtki.setVisible(false);
        txt_eskiDonem.setVisible(false);

        txt_yeniDrsIsim.setVisible(false);
        txt_yeniDrsAkts.setVisible(false);
        txt_yeniDrsVize.setVisible(false);
        txt_yeniDrsFinal.setVisible(false);
        txt_yeniVizeEtki.setVisible(false);
        txt_yeniFinalEtki.setVisible(false);
        txt_yeniDonem.setVisible(false);

        fld_yeniDrsIsim.setVisible(false);
        spn_yeniAkts.setVisible(false);
        spn_yeniDonem.setVisible(false);
        fld_yeniDrsVize.setVisible(false);
        fld_yeniDrsFinal.setVisible(false);
        fld_yeniVizeEtkiO.setVisible(false);
        fld_yeniFinalEtkiO.setVisible(false);

        fld_eskiDrsIsim.setVisible(false);
        spn_eskiAkts.setVisible(false);
        spn_eskiDonem.setVisible(false);
        fld_eskiDrsVize.setVisible(false);
        fld_eskiFinal.setVisible(false);
        fld_eskiVizeEtkiO.setVisible(false);
        fld_EskiFinalEtkiOranı.setVisible(false);

        btn_dersBilgiGuncelle.setVisible(false);
    }

    void guncellenicekVerileriGorunurYap(){
        txt_eskiDrsIsim.setVisible(true);
        txt_eskiDrsAkts.setVisible(true);
        txt_eskiDrsVize.setVisible(true);
        txt_eskiDrsFinal.setVisible(true);
        txt_eskiVizeEtki.setVisible(true);
        txt_eskiFinalEtki.setVisible(true);
        txt_eskiDonem.setVisible(true);

        txt_yeniDrsIsim.setVisible(true);
        txt_yeniDrsAkts.setVisible(true);
        txt_yeniDrsVize.setVisible(true);
        txt_yeniDrsFinal.setVisible(true);
        txt_yeniVizeEtki.setVisible(true);
        txt_yeniFinalEtki.setVisible(true);
        txt_yeniDonem.setVisible(true);

        fld_yeniDrsIsim.setVisible(true);
        spn_yeniAkts.setVisible(true);
        spn_yeniDonem.setVisible(true);
        fld_yeniDrsVize.setVisible(true);
        fld_yeniDrsFinal.setVisible(true);
        fld_yeniVizeEtkiO.setVisible(true);
        fld_yeniFinalEtkiO.setVisible(true);

        fld_eskiDrsIsim.setVisible(true);
        spn_eskiAkts.setVisible(true);
        fld_eskiDrsVize.setVisible(true);
        fld_eskiFinal.setVisible(true);
        fld_eskiVizeEtkiO.setVisible(true);
        fld_EskiFinalEtkiOranı.setVisible(true);
        spn_eskiDonem.setVisible(true);

        btn_dersBilgiGuncelle.setVisible(true);

    }

    /////////////////////////////
    void silinecekSayfasindakileriGizle(){
        txt_silmeDersIsim.setVisible(false);
        txt_silmeAkts.setVisible(false);
        txt_silmeVizeNotu.setVisible(false);
        txt_silmeFinalNotu.setVisible(false);
        txt_silmeVizeEtkiO.setVisible(false);
        txt_silmeFinalEtkiO.setVisible(false);

        fld_silmeDersIsim.setVisible(false);
        fld_silmeAkts.setVisible(false);
        fld_silmeVizeNotu.setVisible(false);
        fld_silmeFinalNotu.setVisible(false);
        fld_silmeVizeEtkiO.setVisible(false);
        fld_silmeFinalEtkiO.setVisible(false);

        btn_dersSil.setVisible(false);
    }

    void silinecekVerileriGorunurYap(){
       txt_silmeDersIsim.setVisible(true);
       txt_silmeAkts.setVisible(true);
       txt_silmeVizeNotu.setVisible(true);
       txt_silmeFinalNotu.setVisible(true);
       txt_silmeVizeEtkiO.setVisible(true);
       txt_silmeFinalEtkiO.setVisible(true);

       fld_silmeDersIsim.setVisible(true);
       fld_silmeAkts.setVisible(true);
       fld_silmeVizeNotu.setVisible(true);
       fld_silmeFinalNotu.setVisible(true);
       fld_silmeVizeEtkiO.setVisible(true);
       fld_silmeFinalEtkiO.setVisible(true);

       btn_dersSil.setVisible(true);

    }
    void kayitEkraniGizle(){
        txt_aktsKayit.setVisible(false);
        txt_finalKayit.setVisible(false);
        txt_derstengecmeKayit.setVisible(false);
        txt_dersIsimKayit.setVisible(false);
        txt_vizeKayit.setVisible(false);
        txt_dersOrtalamaKayit.setVisible(false);
        txt_vizeEtkiOKayit.setVisible(false);
        txt_silmeFinalEtkiO.setVisible(false);
        txt_finalEtkiOKayit.setVisible(false);
        txt_derstenGecmeDurumuKayit.setVisible(false);
        txt_verildigiDonemKayit.setVisible(false);
        txt_harfNotuKayit.setVisible(false);

        fld_aktsKayit.setVisible(false);
        fld_dersIsimKayit.setVisible(false);
        fld_dersOrt100Kayit.setVisible(false);
        fld_vizeNotKayit.setVisible(false);
        fld_vizeEtkiKayit.setVisible(false);
        fld_finalNotKayit.setVisible(false);
        fld_derstenGecme4Kayit.setVisible(false);
        fld_finalEtkiKayit.setVisible(false);
        fld_derstenGecmeDurumuKayit.setVisible(false);
        fld_verildigiDonemKayit.setVisible(false);
        fld_harfNotuKayit.setVisible(false);

    }
    void kayitEkraniGoster(){
        fld_aktsKayit.setVisible(true);
        fld_dersIsimKayit.setVisible(true);
        fld_dersOrt100Kayit.setVisible(true);
        fld_vizeNotKayit.setVisible(true);
        fld_vizeEtkiKayit.setVisible(true);
        fld_finalNotKayit.setVisible(true);
        fld_derstenGecme4Kayit.setVisible(true);
        fld_finalEtkiKayit.setVisible(true);
        fld_derstenGecmeDurumuKayit.setVisible(true);
        fld_verildigiDonemKayit.setVisible(true);
        fld_harfNotuKayit.setVisible(true);

        txt_dersIsimKayit.setVisible(true);
        txt_aktsKayit.setVisible(true);
        txt_vizeKayit.setVisible(true);
        txt_finalKayit.setVisible(true);
        txt_vizeEtkiOKayit.setVisible(true);
        txt_finalEtkiOKayit.setVisible(true);
        txt_dersOrtalamaKayit.setVisible(true);
        txt_derstengecmeKayit.setVisible(true);
        txt_derstenGecmeDurumuKayit.setVisible(true);
        txt_verildigiDonemKayit.setVisible(true);
        txt_harfNotuKayit.setVisible(true);


    }
   public void ortalamaDeneSayfasindakiComponentleriDiziyeAktar(){

        temizlenecekComponent.add(txt_dersIsim1);
        temizlenecekComponent.add(txt_dersIsim2);
        temizlenecekComponent.add(txt_dersIsim3);
        temizlenecekComponent.add(txt_dersIsim4);
        temizlenecekComponent.add(txt_dersIsim5);
        temizlenecekComponent.add(txt_dersIsim6);
        temizlenecekComponent.add(txt_dersIsim7);
        temizlenecekComponent.add(txt_dersIsim8);
        temizlenecekComponent.add(txt_dersIsim9);
        temizlenecekComponent.add(txt_dersIsim10);
        temizlenecekComponent.add(txt_dersIsim11);



        temizlenecekComponent.add(spn_aktsDers1);
        temizlenecekComponent.add(spn_aktsDers2);
        temizlenecekComponent.add(spn_aktsDers3);
        temizlenecekComponent.add(spn_aktsDers4);
        temizlenecekComponent.add(spn_aktsDers5);
        temizlenecekComponent.add(spn_aktsDers6);
        temizlenecekComponent.add(spn_aktsDers7);
        temizlenecekComponent.add(spn_aktsDers8);
        temizlenecekComponent.add(spn_aktsDers9);
        temizlenecekComponent.add(spn_aktsDers10);
        temizlenecekComponent.add(spn_aktsDers11);

        temizlenecekComponent.add(fld_vize1);
        temizlenecekComponent.add(fld_vize2);
        temizlenecekComponent.add(fld_vize3);
        temizlenecekComponent.add(fld_vize4);
        temizlenecekComponent.add(fld_vize5);
        temizlenecekComponent.add(fld_vize6);
        temizlenecekComponent.add(fld_vize7);
        temizlenecekComponent.add(fld_vize8);
        temizlenecekComponent.add(fld_vize9);
        temizlenecekComponent.add(fld_vize10);
        temizlenecekComponent.add(fld_vize11);


        temizlenecekComponent.add(fld_final1);
        temizlenecekComponent.add(fld_final2);
        temizlenecekComponent.add(fld_final3);
        temizlenecekComponent.add(fld_final4);
        temizlenecekComponent.add(fld_final5);
        temizlenecekComponent.add(fld_final6);
        temizlenecekComponent.add(fld_final7);
        temizlenecekComponent.add(fld_final8);
        temizlenecekComponent.add(fld_final9);
        temizlenecekComponent.add(fld_final10);
        temizlenecekComponent.add(fld_final11);

        temizlenecekComponent.add(fld_vizeEtki1);
        temizlenecekComponent.add(fld_vizeEtki2);
        temizlenecekComponent.add(fld_vizeEtki3);
        temizlenecekComponent.add(fld_vizeEtki4);
        temizlenecekComponent.add(fld_vizeEtki5);
        temizlenecekComponent.add(fld_vizeEtki6);
        temizlenecekComponent.add(fld_vizeEtki7);
        temizlenecekComponent.add(fld_vizeEtki8);
        temizlenecekComponent.add(fld_vizeEtki9);
        temizlenecekComponent.add(fld_vizeEtki10);
        temizlenecekComponent.add(fld_vizeEtki11);



        temizlenecekComponent.add(fld_finalEtki1);
        temizlenecekComponent.add(fld_finalEtki2);
        temizlenecekComponent.add(fld_finalEtki3);
        temizlenecekComponent.add(fld_finalEtki4);
        temizlenecekComponent.add(fld_finalEtki5);
        temizlenecekComponent.add(fld_finalEtki6);
        temizlenecekComponent.add(fld_finalEtki7);
        temizlenecekComponent.add(fld_finalEtki8);
        temizlenecekComponent.add(fld_finalEtki9);
        temizlenecekComponent.add(fld_finalEtki10);
        temizlenecekComponent.add(fld_finalEtki11);


       temizlenecekComponent.add(cmbx_harfNotu1);
       temizlenecekComponent.add(cmbx_harfNotu2);
       temizlenecekComponent.add(cmbx_harfNotu3);
       temizlenecekComponent.add(cmbx_harfNotu4);
       temizlenecekComponent.add(cmbx_harfNotu5);
       temizlenecekComponent.add(cmbx_harfNotu6);
       temizlenecekComponent.add(cmbx_harfNotu7);
       temizlenecekComponent.add(cmbx_harfNotu8);
       temizlenecekComponent.add(cmbx_harfNotu9);
       temizlenecekComponent.add(cmbx_harfNotu10);
       temizlenecekComponent.add(cmbx_harfNotu11);


       harfNotlariOrtalamaDene.add(cmbx_harfNotu1);
       harfNotlariOrtalamaDene.add(cmbx_harfNotu2);
       harfNotlariOrtalamaDene.add(cmbx_harfNotu3);
       harfNotlariOrtalamaDene.add(cmbx_harfNotu4);
       harfNotlariOrtalamaDene.add(cmbx_harfNotu5);
       harfNotlariOrtalamaDene.add(cmbx_harfNotu6);
       harfNotlariOrtalamaDene.add(cmbx_harfNotu7);
       harfNotlariOrtalamaDene.add(cmbx_harfNotu8);
       harfNotlariOrtalamaDene.add(cmbx_harfNotu9);
       harfNotlariOrtalamaDene.add(cmbx_harfNotu10);
       harfNotlariOrtalamaDene.add(cmbx_harfNotu11);



    }
    public void ortalamaDeneSayfasindakiVerileriTemizle(){
        for(Component temizle:temizlenecekComponent){

            if (temizle instanceof JTextField ){
                ((JTextField) temizle).setText("");
            } else{
                if (temizle instanceof JSpinner){
                    ((JSpinner) temizle).setValue(1);
                }
            }
        }
    }

    void dersKutulariniGizleOrtDene(){

        txt_dersIsim.setVisible(false);
        txt_akts.setVisible(false);
        txt_vizeNotu.setVisible(false);
        txt_finalNotu.setVisible(false);
        txt_vizeEtkiOrani.setVisible(false);
        txt_finaltkiOrani.setVisible(false);

        for (Component component:temizlenecekComponent){        //Öncesinde tüm componentlerin görünürlüğünü kapatır.
            component.setVisible(false);
        }
    }
    void kayitliDersleriKutularaDoldurOrtDene(int dersSayisi,String ortalamaHesaplanicakNotTipi){

        for (int dersSayisiIndex=0;dersSayisiIndex<dersSayisi;dersSayisiIndex++) {

            dersIsimleriOrtalamaDene.get(dersSayisiIndex).setText(kisiDonemdekiDersIsimleriAROrtDene.get(dersSayisiIndex));
            aktslerOrtalamaDene.get(dersSayisiIndex).setValue(aktslerOrtalamaDeneIntAR.get(dersSayisiIndex));

            if(ortalamaHesaplanicakNotTipi.equals("100luk")){
                vizeNotlariOrtalamaDene.get(dersSayisiIndex).setText(vizeNotlariOrtalamaDeneIntAR.get(dersSayisiIndex).toString());
                finalNotlariOrtalamaDene.get(dersSayisiIndex).setText(finalNotlariOrtalamaDeneIntAR.get(dersSayisiIndex).toString());
                vizeEtkiOranlariOrtalamaDene.get(dersSayisiIndex).setText(vizeEtkiOranlariOrtalamaDeneIntAR.get(dersSayisiIndex).toString());
                finalEtkiOranlariOrtalamaDene.get(dersSayisiIndex).setText(finalEtkiOranlariOrtalamaDeneIntAR.get(dersSayisiIndex).toString());
            }else {
                harfNotlariOrtalamaDene.get(dersSayisiIndex).setSelectedItem(harfNotlariDonemdekiAROrtDene.get(dersSayisiIndex).trim());

            }


        }

    }


    void dersSayisinaGoreDizileriOlustur(int dersSayisi,String birim){
        JTextField anlik;
        JSpinner anlik2;
        JComboBox anlik3;

        int anlikIndex=1;
        int anlikIndex2=1;
        int anlikIndex3=1;
        int uzunluk=0;
        String ifade="";
        ArrayList dizi = null;


        switch (birim){
            case "vize":
                ifade="numberFld_vize";
                uzunluk=15;
                dizi=vizeNotlariOrtalamaDene;
                break;
            case "final":
                ifade="numberFld_final";
                uzunluk=16;
                dizi=finalNotlariOrtalamaDene;
                break;
            case "akts":
                ifade="spn_ortalamaDeneAkts";
                uzunluk=21;
                dizi=aktslerOrtalamaDene;
                break;
            case "vizeEtki":
                ifade="numberFld_vizeEtki";
                uzunluk=19;
                dizi=vizeEtkiOranlariOrtalamaDene;
                break;
            case "finalEtki":
                ifade="numberFld_finalEtki";
                uzunluk=20;
                dizi=finalEtkiOranlariOrtalamaDene;
                break;
            case "dersIsim":
                ifade="txt_ders";
                uzunluk=9;
                dizi=dersIsimleriOrtalamaDene;
                break;
            case "dersHarfNotu":
                ifade="cmbx_harf";
                uzunluk=16;
                dizi=harfNotlariOrtalamaDene;
                break;
            default:
                break;
        }
            dizi.clear();
        for(Component anlikComponent : temizlenecekComponent ){

            try {
                anlik = (JTextField) anlikComponent;

                  if(anlikComponent.getName().toString().startsWith(ifade) && anlikComponent.getName().endsWith(String.valueOf(anlikIndex)) &&  anlikComponent.getName().length()-uzunluk<=2 && anlikIndex<=dersSayisi){
                      dizi.add(anlik);
                      anlikIndex++;
                  }


            }catch (ClassCastException e) {

              try {
                  anlik2 = (JSpinner) anlikComponent;

                  if (anlikComponent.getName().toString().startsWith(ifade) && anlikComponent.getName().endsWith(String.valueOf(anlikIndex2)) && anlikIndex2 <= dersSayisi) {

                      if (dersSayisi != 11 && anlikComponent.getName().endsWith("11")) {
                          //ders sayısı 11 iken eklendi
                          dizi.add(anlik2);

                      } else {
                          dizi.add(anlik2);

                      }
                  }
                  anlikIndex2++;
                  // System.out.println(e.getMessage());

              }catch (ClassCastException a){
                  anlik3 = (JComboBox) anlikComponent;

                  if (anlikComponent.getName().toString().startsWith(ifade) && anlikComponent.getName().endsWith(String.valueOf(anlikIndex3)) && anlikIndex3 <= dersSayisi) {

                      if (dersSayisi != 11 && anlikComponent.getName().endsWith("11")) {
                          //ders sayısı 11 iken eklendi
                          dizi.add(anlik3);
                          System.out.println("geldim");

                      } else {
                          dizi.add(anlik3);
                          System.out.println("geldim2");
                      }
                  }
                  anlikIndex3++;
                  // System.out.println(e.getMessage());
              }
            }

        }

    }
    void kayitSayfasindaki(Boolean isGorunurYap){
        if(isGorunurYap){
            fld_dersIsimKayit.setVisible(true);
            fld_aktsKayit.setVisible(true);
            fld_finalNotKayit.setVisible(true);
            fld_vizeNotKayit.setVisible(true);
            fld_vizeEtkiKayit.setVisible(true);
            fld_dersOrt100Kayit.setVisible(true);
            fld_derstenGecme4Kayit.setVisible(true);
            fld_finalEtkiKayit.setVisible(true);

            txt_dersIsimKayit.setVisible(true);
            txt_aktsKayit.setVisible(true);
            txt_finalKayit.setVisible(true);
            txt_vizeEtkiOKayit.setVisible(true);
            txt_finalEtkiOKayit.setVisible(true);
            fld_dersOrt100Kayit.setVisible(true);
            fld_derstenGecme4Kayit.setVisible(true);
            fld_finalEtkiKayit.setVisible(true);

        }else {

        }
    }

     void dersKutulariniGetirOrtDene(int dersSayisi,String notTipi) {
        //MenuGui.dersSayisiIndex=1;
        String ifade="";



         txt_dersIsim.setVisible(true);
         txt_akts.setVisible(true);
         switch (notTipi){
             case "harf":
                 if(!harfAyarlandi){
                     cmbx_harfNotuAyarlaGetir();
                 }

                 txt_vizeNotu.setVisible(false);
                 txt_finalNotu.setVisible(false);
                 txt_vizeEtkiOrani.setVisible(false);
                 txt_finaltkiOrani.setVisible(false);
                 txt_harfNotuOrtDene.setVisible(true);


                 for (int dersSayisiIndex=1;dersSayisiIndex<=dersSayisi;dersSayisiIndex++) {

                     ifade=String.valueOf(dersSayisiIndex);

                     for (Component component:temizlenecekComponent){
                         try {
                             if (component.getName().endsWith(ifade) && !component.getName().startsWith("numberFld") && !component.getName().endsWith("11")) {

                                 component.setVisible(true);
                                 if (component.getName().startsWith("cmbx")){
                                     JComboBox comboBox= (JComboBox) component;
                                     comboBox.setSelectedItem("AA");
                                 }

                                 try {
                                     JTextField jt=(JTextField) component;//sonradan
                                     jt.setText("");
                                 }catch (ClassCastException E){

                                 }
                                 if(component.getName().startsWith("spn")){
                                     JSpinner aktsJS = (JSpinner) component;
                                     aktsJS.setValue(1);
                                 }

                             }/*else if(component.getName().startsWith("spn_ortalama") && !component.getName().endsWith("11") ){
                                 JSpinner aktsJS = (JSpinner) component;
                                 //aktsJS.setVisible(true);
                                 aktsJS.setValue(1);

                             }*/
                             else if (dersSayisi==11 && component.getName().endsWith("11") && !component.getName().startsWith("numberFld")){

                                 component.setVisible(true);
                                 if(component.getName().startsWith("spn")){
                                     JSpinner aktsJS = (JSpinner) component;
                                     aktsJS.setValue(1);
                                 }
                             }

                         }catch (NullPointerException e){
                             System.out.println(e.getMessage());    //  getName ile dönen değer null ise burası çalışıyor .
                             component.setVisible(false);
                         }
                     }
                 }

                 break;

             case "100luk":
                 txt_harfNotuOrtDene.setVisible(false);
                 cmbx_harfNotu1.setVisible(false);

                 txt_vizeNotu.setVisible(true);
                 txt_finalNotu.setVisible(true);
                 txt_vizeEtkiOrani.setVisible(true);
                 txt_finaltkiOrani.setVisible(true);


                 for (int dersSayisiIndex=1;dersSayisiIndex<=dersSayisi;dersSayisiIndex++) {

                     ifade=String.valueOf(dersSayisiIndex);

                     for (Component component:temizlenecekComponent){
                         try {
                             if (component.getName().endsWith(ifade) && !component.getName().startsWith("cmbx_harf") && !component.getName().endsWith("11")) {

                                 component.setVisible(true);

                                 try {
                                     JTextField jt=(JTextField) component;//sonradan
                                     jt.setText("");
                                 }catch (ClassCastException E){

                                 }

                                 if(component.getName().startsWith("spn")){
                                     JSpinner aktsJS = (JSpinner) component;
                                     aktsJS.setValue(1);
                                 }
                             } else if (dersSayisi==11 && component.getName().endsWith("11")){

                                 component.setVisible(true);
                                 if(component.getName().startsWith("spn")){
                                     JSpinner aktsJS = (JSpinner) component;
                                     aktsJS.setValue(1);
                                 }
                             }
                         }catch (NullPointerException e){
                             System.out.println(e.getMessage());    //  getName ile dönen değer null ise burası çalışıyor .
                             component.setVisible(false);
                         }
                     }
                 }
                 for(JComboBox comboBoxDersHarfNotu:harfNotlariOrtalamaDene){
                     comboBoxDersHarfNotu.setVisible(false);
                     comboBoxDersHarfNotu.setSelectedItem("AA");
                 }
                 break;

         }


     }


     void kayitEkraniDersBilgileriniDoldur(ArrayList dersinBilgileri){

         if(dersinBilgileri.isEmpty()){
             kayitEkraniGizle();
         }else {
             fld_verildigiDonemKayit.setText(dersinBilgileri.get(0).toString());
             fld_aktsKayit.setText(dersinBilgileri.get(1).toString());
             fld_vizeNotKayit.setText(dersinBilgileri.get(2).toString());
             fld_finalNotKayit.setText(dersinBilgileri.get(3).toString());
             fld_vizeEtkiKayit.setText(dersinBilgileri.get(4).toString());
             fld_finalEtkiKayit.setText(dersinBilgileri.get(5).toString());
             fld_dersOrt100Kayit.setText(dersinBilgileri.get(6).toString());
             fld_derstenGecme4Kayit.setText(dersinBilgileri.get(7).toString());
             fld_derstenGecmeDurumuKayit.setText(dersinBilgileri.get(8).toString());
             fld_harfNotuKayit.setText("");

             if (!dersinBilgileri.get(9).toString().isEmpty()) {
                 fld_harfNotuKayit.setText(dersinBilgileri.get(9).toString());
             }
         }
     }


    void kayitSayfasiSecilenDersBilgileriniGoster(String dersIsim){
        int dersinDonemi = vt.dersDonemBilgisiGetir(dersIsim);

        ArrayList dersinBilgileri = new ArrayList();

        dersinBilgileri = vt.dersinBilgileriniGetir(dersIsim,dersinBilgileri);
        kayitEkraniDersBilgileriniDoldur(dersinBilgileri);

    }

    public  void tamEkranYap(boolean isTamEkranYap){
        new TamEkran(this, isTamEkranYap);
    }


    MenuGui(){
        ortalamaSonucuGizle();
        btn_sistemeKayitEt.setVisible(false);
        fld_sinavNotunaGoreOrt.setVisible(false);
        lbl_sinavNotunaGoreOrt.setVisible(false);
        cmbx_harfNotu1.setVisible(false);
        txt_harfNotuOrtDene.setVisible(false);
        spinnerLimitle();
        lbl_aktifKullanici.setText(AktifKullanici.aktifKullaniciKullaniciAdi);
        //String anlikGnoString =String.valueOf(vt.gnoVarsaGetir(AktifKullanici.aktifKullaniciID));
        //fld_anlikGnoKayit.setText(anlikGnoString);
        //fld_gnoGercerliDonem.setText(String.valueOf(VeriTabaniIslemleri.gecerliDonem));
        kayitEkraniGizle();
        agacListeAyarla();
       // vt.donemlereGoreKayitEkraniGnoHesapla(vt.cekilenDersDonem1.size(),vt.cekilenDersDonem);
        fld_anlikGnoKayit.setText(String.valueOf(vt.donemlereGoreKayitEkraniGnoHesapla(vt.cekilenDersDonem1.size(),vt.cekilenDersDonem)));
        gnoGecerliDonemSt=String.valueOf(vt.cekilenDersDonem[vt.cekilenDersDonem1.size()-1]);
        fld_gnoGercerliDonem.setText(gnoGecerliDonemSt);
        silinecekSayfasindakileriGizle();
        guncellenicekSayfasindakileriGizle();
        cmbx_silinecekDersGonder();
        cmbx_guncellenicekDersGonder();

        txt_kacDersHesaplanicak.setVisible(false);
        spn_hesaplanicakDersSayisi.setVisible(false);

        // Ekran boyutlarını almak için GraphicsDevice kullan
        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = graphics.getDefaultScreenDevice();

        // Tam ekran moduna geç
        // setUndecorated(true); // Pencere kenarlıkları olmadan tam ekran yap
        //setResizable(false); // Pencerenin boyutunu değiştirmeyi engelle
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             // JFrame fr = new JFrame();



        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        this.add(JP_Menu);

        ImageIcon icon = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\OrtalamaHesaplamaUygulamasi\\src\\A+.jpeg");
        //ImageIcon icon =new ImageIcon("C:\\Users\\HP\\IdeaProjects\\OrtalamaHesaplamaUygulamasi\\src\\Ortalama Hesapla6.png");
        Image image = icon.getImage();
        setIconImage(image);
        // Ekranı tam ekran yap
        device.setFullScreenWindow(this);
        //setSize(600,600);
        setTitle("Ortalama Hesaplama Uygulaması");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width )/2,(Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height )/2);





        btn_ortalamaHesaplaNotKaydet.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String finalString = fld_final.getText();
                    finalNotu = Integer.parseInt(finalString);

                    String vizeString = fld_vize.getText();
                     vizeNotu = Integer.parseInt(vizeString);

                    String vizeEtkiOString = fld_vizeEtki.getText();
                    vizeEtkiOrani = Integer.parseInt(vizeEtkiOString);

                    String finalEtkiString = fld_finalEtki.getText();
                    finalEtkiOrani = Integer.parseInt(finalEtkiString);

                    akts = (int) spn_Akts.getValue();
                    donem=(int) spn_donem.getValue();
                    isNotGirisindeHata=false;
                } catch (NumberFormatException ex) {
                    System.out.println(ex.getMessage());
                }

                if( vizeNotu <0 || vizeNotu >100){
                    isNotGirisindeHata=true;
                    tamEkranYap(false);
                    JOptionPane.showInternalMessageDialog(JP_Menu,"!! Vize Notunuz 0-100 Aralığında Olmalılıdır !!");
                    tamEkranYap(true);
                }  if (finalNotu < 0 || finalNotu > 100) {
                    isNotGirisindeHata=true;
                    tamEkranYap(false);
                    JOptionPane.showInternalMessageDialog(JP_Menu,"!! Final Notunuz 0-100 Aralığında Olmalılıdır !!");
                    tamEkranYap(true);
                } if ( (vizeEtkiOrani + finalEtkiOrani ) != 100) {
                    isNotGirisindeHata=true;
                    tamEkranYap(false);
                    JOptionPane.showInternalMessageDialog(JP_Menu,"!! Vize ve Final Etki Oranları Toplamı 100 'ü Vermelidir !!");
                    tamEkranYap(true);
                }  if (akts > 30 || akts <= 0) {
                    isNotGirisindeHata=true;
                    tamEkranYap(false);
                    JOptionPane.showInternalMessageDialog(JP_Menu,"!! Akts Değeriniz 30 'dan Büyük, 0 'dan Küçük Olamaz !!");
                    tamEkranYap(true);
                }if(!isNotGirisindeHata){

                     ortalamaHesapla1.dersOrtalamasiHesapla(vizeNotu,finalNotu,akts,vizeEtkiOrani,finalEtkiOrani);
                    //ortalamaHesapla1.anlikDonemOrtalamasiHesapla(AktifKullanici.aktifKullaniciID,donem,Integer.parseInt(fld_kalanDersSayisi.getText()));
                     ortalamaHesapla1.donemOrtalamaHesapla(AktifKullanici.aktifKullaniciID,donem);
                     ortalamaHesapla1.yeniDonemOrtalamasiHesapla(AktifKullanici.aktifKullaniciID,donem);
                     fld_Eskigno.setText(String.valueOf(vt.eskiGnoGetir(AktifKullanici.aktifKullaniciID,donem)));
                     vt.yeniGnoHesapla(AktifKullanici.aktifKullaniciID,donem,OrtalamaHesapla.yeniDonemOrtalamasi4,OrtalamaHesapla.donemOrtalamasi4);
                    tamEkranYap(false);
                    JOptionPane.showMessageDialog(JP_Menu,"DERS:"+ fld_dersIsim.getText() + "\ndersten geçme notunuz(4lük) : "+ortalamaHesapla1.dortlukDersGecmeNotu+"\ndersten geçme notunuz(100 lük) : "+ortalamaHesapla1.derstenGecmeNotu100+"\n\tDERSTEN GEÇME DURUMUNUZ-->> "+ortalamaHesapla1.dersGecmeDurumuString);
                    tamEkranYap(false);
                    fld_yno.setText(String.valueOf(OrtalamaHesapla.yeniDonemOrtalamasi4));
                    fld_EskiYno.setText(String.valueOf(OrtalamaHesapla.donemOrtalamasi4));
                    fld_dersGecme100.setText(String.valueOf(OrtalamaHesapla.derstenGecmeNotu100));
                    fld_dersGecme4.setText(String.valueOf(OrtalamaHesapla.dortlukDersGecmeNotu));
                    fld_gno.setText(String.valueOf(VeriTabaniIslemleri.yeniGno));
                    fld_harfNotu.setText(String.valueOf(OkulHarfNotlari.harfNotuStr));
                    btn_sistemeKayitEt.setVisible(true);
                        if(fld_kalanDersSayisi.getText().equals("1")) {
                            ortalamaHesapla1.donemOrtalamaHesapla(AktifKullanici.aktifKullaniciID, donem);
                            ortalamaHesapla1.anlikDonemOrtalamasiHesapla(AktifKullanici.aktifKullaniciID, donem, Integer.parseInt(fld_kalanDersSayisi.getText()));
                            ortalamaSonucuGorunurYap(false);
                        }else if (!fld_kalanDersSayisi.getText().equals("0")) {

                            fld_yno.setVisible(true);
                            fld_gno.setVisible(true);
                            lbl_yno.setVisible(true);
                            lbl_gno.setVisible(true);
                            lbl_eskigno.setVisible(true);
                            lbl_eskiyno.setVisible(true);
                            fld_Eskigno.setVisible(true);
                            fld_EskiYno.setVisible(true);
                            fld_dersGecme100.setVisible(true);
                            fld_dersGecme4.setVisible(true);
                            lbl_dersGecme4.setVisible(true);
                            lbl_dersGecme100.setVisible(true);

                        }else{

                            ortalamaSonucuGorunurYap(true);
                        }

                }
            }
        });
        btn_cikisYapKullanici.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VeriTabaniIslemleri.gecerliDonem=0;
                dispose();
                AktifKullanici.aktifKullaniciBilgileriSifirla();
                new GirisEkrani();
            }
        });

        if(fld_anlikGnoKayit.getText().isEmpty() || fld_anlikGnoKayit.getText().equals("0.0")){

             tamEkranYap(false);
            JOptionPane.showMessageDialog(null,"Gno(Genel ortalama) bilginizi giriniz");
            tamEkranYap(true);


            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    btn_gnoEkle.doClick(); // doClick işlemi EDT üzerinde çalışır
                }
            });


        }


        tabbedPane1.addChangeListener(e -> {
            int secilenIndex = tabbedPane1.getSelectedIndex();
            String secilenTabIsmi = tabbedPane1.getTitleAt(secilenIndex);

            switch (secilenTabIsmi){
                case "Not Kaydet":
                    kayitEkraniGizle();
                    ortalamaSonucuGizle();
                    spn_donem.setValue(1);

                    boolean isDongudenCik=false;
                    do {
                        tamEkranYap(false);
                        dersSayisiString=JOptionPane.showInputDialog(JP_Menu, "Kaç ders için hesaplama işlemi yapıcaksınız.");
                        tamEkranYap(true);

                        try {

                            dersSayisi = Integer.parseInt(dersSayisiString);
                            fld_kalanDersSayisi.setText(dersSayisiString);

                        } catch (NumberFormatException e2) {

                            try {
                                if (dersSayisi<0){
                                    isDongudenCik=false;
                                    dersSayisi=0;
                                } else if (dersSayisiString.isEmpty() || dersSayisiString==null) {
                                    System.out.println("Kaç ders girilecği sorusuna cancel cevabı verildi : " + e2.getMessage());
                                    dersSayisi=0;
                                    //dispose();
                                    tabbedPane1.setSelectedIndex(0);
                                    //new MenuGui();
                                    isDongudenCik=true;
                                }
                            }catch (NullPointerException m){
                                System.out.println("Kaç ders girilecği sorusuna cancel cevabı verildi : " + m.getMessage());
                                dersSayisi=0;
                                //dispose();
                                tabbedPane1.setSelectedIndex(0);
                                //new MenuGui();
                                isDongudenCik=true;
                            }
                        }
                    } while (dersSayisi <= 0 && !isDongudenCik);


                        fld_dersIsim.setEnabled(true);
                        fld_vize.setEnabled(true);
                        fld_final.setEnabled(true);
                        fld_vizeEtki.setEnabled(true);
                        fld_finalEtki.setEnabled(true);
                        spn_Akts.setEnabled(true);
                        spn_donem.setEnabled(true);
                        btn_ortalamaHesaplaNotKaydet.setEnabled(true);
                        this.revalidate();
                        this.repaint();

                        cmbx_silinecekDersGonder();
                        cmbx_guncellenicekDersGonder();
                        cmbx_EnYuksekGonder();

                    break;
                case "Kayıtlı Notlar":
                    agacListeAyarla();
                    kayitEkraniGizle();
                    fld_anlikGnoKayit.setText(String.valueOf(vt.donemlereGoreKayitEkraniGnoHesapla(vt.cekilenDersDonem1.size(),vt.cekilenDersDonem)));
                    gnoGecerliDonemSt=String.valueOf(vt.cekilenDersDonem[vt.cekilenDersDonem1.size()-1]);
                    fld_gnoGercerliDonem.setText(gnoGecerliDonemSt);
                    ortalamaSonucuGizle();
                    revalidate();
                    repaint();
                    break;
                case "Ders Bilgisi Güncelle":
                    kayitEkraniGizle();
                    ortalamaSonucuGizle();
                    cmbx_guncellenicekDersGonder();
                    guncellenicekSayfasindakileriGizle();

                    break;
                case "Ders Sil":
                    kayitEkraniGizle();
                    ortalamaSonucuGizle();
                    cmbx_silinecekDersGonder();
                    silinecekSayfasindakileriGizle();
                    break;
                case "En Yüksek Alınan Not":
                    kayitEkraniGizle();
                    ortalamaSonucuGizle();
                    cmbx_EnYuksekGonder();
                    break;
                case "Ortalama Dene":
                    kayitEkraniGizle();
                    ortalamaSonucuGizle();
                    addNumericKeyListenerToAllTextFields(tab_ortalamaDene);//Ortalama Dene sekmesinde sayılar dışında ifade yazılmasını engeller.
                    ortalamaDeneSayfasindakiComponentleriDiziyeAktar();
                    if(chckbx_100lukNotGirisi.isSelected()){
                        for (JComboBox comboBox:harfNotlariOrtalamaDene){
                            comboBox.setVisible(false);
                        }
                    }
                    revalidate();
                    repaint();
                    //kayitliDersleriGizle();
                    //kayitliDersleriGetir(1);
                    break;
                default:
                    System.out.println("HATALI PENCERE DEĞİŞİMİ");
            }

        });

        btn_sistemeKayitEt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(dersSayisi>0){
                    String harfNotu="";
                    harfNotu=ortalamaHesapla1.okulHarfNotlari.harfNotunuGetir(OrtalamaHesapla.derstenGecmeNotu100,AktifKullanici.aktifKullaniciOkul);
                    vt.dersBilgileriGir(donem,fld_dersIsim.getText(),akts,vizeNotu,vizeEtkiOrani,finalNotu,finalEtkiOrani,harfNotu);

                    agacListeAyarla();

                    fld_dersIsim.setText("");
                    fld_vize.setText("");
                    fld_finalEtki.setText("");
                    fld_final.setText("");
                    fld_vizeEtki.setText("");
                    spn_Akts.setValue(1);
                    //spn_donem.setValue(1);
                    dersSayisi-=1;
                    dersSayisiString=String.valueOf(dersSayisi);
                    fld_kalanDersSayisi.setText(dersSayisiString);


                    ortalamaSonucuGizle();
                    btn_sistemeKayitEt.setVisible(false);
                    if(dersSayisi==0){
                        tamEkranYap(false);
                        int cevap = JOptionPane.showConfirmDialog(JP_Menu,"Yeni ders ekleyecek misiniz ?");
                        tamEkranYap(false);
                        vt.gnoYnoGuncelle(AktifKullanici.aktifKullaniciID,donem,Float.parseFloat(fld_gno.getText()),Float.parseFloat(fld_yno.getText()));

                         switch (cevap){
                            case 0://ders ekliycek
                                dersSayisi=1;
                                fld_dersIsim.setEnabled(false);
                                fld_vize.setEnabled(false);
                                fld_final.setEnabled(false);
                                fld_vizeEtki.setEnabled(false);
                                fld_finalEtki.setEnabled(false);
                                spn_Akts.setEnabled(false);
                                spn_donem.setEnabled(false);
                                btn_ortalamaHesaplaNotKaydet.setEnabled(false);
                                tabbedPane1.setSelectedIndex(3);
                                tabbedPane1.setSelectedIndex(1);

                                break;
                            case 1://ders eklemiycek
                               fld_dersIsim.setEnabled(false);
                               fld_vize.setEnabled(false);
                               fld_final.setEnabled(false);
                               fld_vizeEtki.setEnabled(false);
                               fld_finalEtki.setEnabled(false);
                               spn_Akts.setEnabled(false);
                               spn_donem.setEnabled(false);
                               btn_ortalamaHesaplaNotKaydet.setEnabled(false);
                                break;
                            case 2://ders eklemiycek
                                fld_dersIsim.setEnabled(false);
                                fld_vize.setEnabled(false);
                                fld_final.setEnabled(false);
                                fld_vizeEtki.setEnabled(false);
                                fld_finalEtki.setEnabled(false);
                                spn_Akts.setEnabled(false);
                                spn_donem.setEnabled(false);
                                btn_ortalamaHesaplaNotKaydet.setEnabled(false);
                                break;
                        }
                    }
                }else {
                    tamEkranYap(false);
                   int ders_ekleme=JOptionPane.showConfirmDialog(JP_Menu,"Yeni ders ekleyecek misiniz ?");
                    tamEkranYap(true);
                }

            }
        });
        cmbx_guncellenicekDers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(cmbx_guncellenicekDers.getSelectedIndex()!=-1){
                    guncellenicekVerileriGorunurYap();

                   GuncellenicekBilgiler.guncellenicekDersIsmi= (String) cmbx_guncellenicekDers.getSelectedItem();

                   vt.guncellenicekKullaniclarinBilgileriniCekme((String)cmbx_guncellenicekDers.getSelectedItem());

                    fld_eskiDrsIsim.setText(GuncellenicekBilgiler.guncellenicekDersIsmi);
                    spn_eskiAkts.setValue(GuncellenicekBilgiler.guncellenicekDersAkts);
                    fld_eskiDrsVize.setText(""+GuncellenicekBilgiler.guncellenicekVizeNotu);
                    fld_eskiFinal.setText(""+GuncellenicekBilgiler.guncellenicekFinalNotu);
                    fld_eskiVizeEtkiO.setText(""+GuncellenicekBilgiler.guncellenicekVizeEtkiO);
                    fld_EskiFinalEtkiOranı.setText(""+GuncellenicekBilgiler.guncellenicekFinalEtkiO);
                    spn_eskiDonem.setValue(GuncellenicekBilgiler.guncellenicekDonem);


                    fld_yeniDrsIsim.setText(fld_eskiDrsIsim.getText());
                    fld_yeniDrsVize.setText(""+GuncellenicekBilgiler.guncellenicekVizeNotu);
                    fld_yeniDrsFinal.setText(""+GuncellenicekBilgiler.guncellenicekFinalNotu);
                    fld_yeniVizeEtkiO.setText(""+GuncellenicekBilgiler.guncellenicekVizeEtkiO);
                    fld_yeniFinalEtkiO.setText(""+GuncellenicekBilgiler.guncellenicekFinalEtkiO);
                    spn_yeniAkts.setValue(GuncellenicekBilgiler.guncellenicekDersAkts);
                    spn_yeniDonem.setValue(GuncellenicekBilgiler.guncellenicekDonem);

                }
            }
        });
        cmbx_silinecekDers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(cmbx_silinecekDers.getSelectedIndex()!=-1){

                    silinecekVerileriGorunurYap();

                    fld_silmeDersIsim.setText((String) cmbx_silinecekDers.getSelectedItem());

                    SilinecekBilgiler.silinecekDersIsmi= (String) cmbx_silinecekDers.getSelectedItem();


                    vt.silinecekKullanicininBilgileriniCekme(SilinecekBilgiler.silinecekDersIsmi);

                        fld_silmeAkts.setText(String.valueOf(SilinecekBilgiler.silinecekDersAkts));
                        fld_silmeVizeNotu.setText(""+SilinecekBilgiler.silinecekVizeNotu);
                        fld_silmeFinalNotu.setText(""+SilinecekBilgiler.silinecekFinalNotu);
                        fld_silmeVizeEtkiO.setText(""+SilinecekBilgiler.silinecekVizeEtkiO);
                        fld_silmeFinalEtkiO.setText(""+SilinecekBilgiler.silinecekFinalEtkiO);


                }
            }
        });
        btn_dersSil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

           boolean isDersVeNotSil =vt.dersVeNotSil();
           if (isDersVeNotSil){
               tamEkranYap(false);
               JOptionPane.showMessageDialog(JP_Menu,"Seçtiğiniz derse ait bilgiler sistemden silinmiştir.");
               tamEkranYap(true);
               vt.kisininKayitliDersleriniGetir();
               agacListeAyarla();
               cmbx_EnYuksekGonder();
               cmbx_guncellenicekDersGonder();
               cmbx_silinecekDersGonder();


               tabbedPane1.setSelectedIndex(3);
           }

            }
        });
        btn_dersBilgiGuncelle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!fld_yeniDrsIsim.getText().isEmpty() && !fld_yeniDrsVize.getText().isEmpty() && !fld_yeniDrsFinal.getText().isEmpty() && !fld_yeniVizeEtkiO.getText().isEmpty() && !fld_yeniFinalEtkiO.getText().isEmpty()){

                    GuncellenicekBilgiler.guncelDersIsmi=fld_yeniDrsIsim.getText();
                    GuncellenicekBilgiler.guncelDersAkts= (Integer) spn_yeniAkts.getValue();
                    GuncellenicekBilgiler.guncelDonem= (Integer) spn_yeniDonem.getValue();
                    GuncellenicekBilgiler.guncelVizeNotu = Integer.parseInt(fld_yeniDrsVize.getText());
                    GuncellenicekBilgiler.guncelFinalNotu =Integer.parseInt(fld_yeniDrsFinal.getText());
                    GuncellenicekBilgiler.guncelVizeEtkiO = Integer.parseInt(fld_yeniVizeEtkiO.getText());
                    GuncellenicekBilgiler.guncelFinalEtkiO =Integer.parseInt(fld_yeniFinalEtkiO.getText());


                    ArrayList dersinBilgileri2 = new ArrayList();
                    dersinBilgileri2.clear();

                    vt.dersVeNotguncelle();

                    dersinBilgileri2 = vt.dersinBilgileriniGetir(GuncellenicekBilgiler.guncelDersIsmi,dersinBilgileri2);

                    Float vizeNot=(float)dersinBilgileri2.get(2);
                    Float finalNot=(float)dersinBilgileri2.get(3);
                    int vizeEtkiO=(int)dersinBilgileri2.get(4);
                    int finalEtkiO=(int)dersinBilgileri2.get(5);

                    ortalamaHesapla1.dersOrtalamasiHesapla(vizeNot.intValue(),finalNot.intValue(),(int)dersinBilgileri2.get(1),vizeEtkiO,finalEtkiO);

                    OkulHarfNotlari okulHarfNotlari = new OkulHarfNotlari();
                    GuncellenicekBilgiler.guncelHarfNotu = okulHarfNotlari.harfNotunuGetir(OrtalamaHesapla.derstenGecmeNotu100,AktifKullanici.aktifKullaniciOkul);
                    GuncellenicekBilgiler.gunceldersGecmeDurumu = OrtalamaHesapla.dersGecmeDurumuString;

                    vt.dersOrtBilgileriGuncelle(OrtalamaHesapla.dortlukDersGecmeNotu,OrtalamaHesapla.derstenGecmeNotu100);

                    tamEkranYap(false);
                   JOptionPane.showMessageDialog(JP_Menu,"Güncelleme İşlemi Başarıyla Gerçekleşti");
                    tamEkranYap(true);

                   tabbedPane1.setSelectedIndex(4);
                   tabbedPane1.setSelectedIndex(2);
                }else {
                    tamEkranYap(false);
                    JOptionPane.showMessageDialog(JP_Menu,"Eksik Yeni Değerler Tespit Edildi !!");
                    tamEkranYap(true);
                }
            }
        });
        btn_sorgulaEnyksk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(cmbx_derslerEnyksk.getSelectedIndex()!=-1) {
                     EnYuksekBilgileri.enYuksekDersIsim =(String) cmbx_derslerEnyksk.getSelectedItem();
                     vt.enYuksekSorgulariYap(EnYuksekBilgileri.enYuksekDersIsim);

                     fld_enyAlanKisi.setText(EnYuksekBilgileri.enYuksekVNotuAlan);
                     fld_enyFalanKisi.setText(EnYuksekBilgileri.enYuksekFNotuAlan);
                     fld_enyNot.setText(""+EnYuksekBilgileri.enYuksekVizeNotu);
                     fld_enyFfinalNot.setText(""+EnYuksekBilgileri.enYuksekFinalNotu);
                     fld_enyFalanToplamKisiSayisi.setText(""+EnYuksekBilgileri.enyFDersiAlanSayisi);

                     int kisiVizeNotu=vt.kisiVizeFinalNotuGetir(EnYuksekBilgileri.enYuksekDersIsim,true);
                     int kisiFinalNotu=vt.kisiVizeFinalNotuGetir(EnYuksekBilgileri.enYuksekDersIsim,false);

                     fld_vizeNotun.setText(""+kisiVizeNotu);
                     fld_finalNotun.setText(""+kisiFinalNotu);

                     fld_vizeBasariSirasi.setText(""+vt.kisiVizeFinalBasariSirasiOgrenme(kisiVizeNotu,EnYuksekBilgileri.enYuksekDersIsim,true));
                     fld_finalBasariSirasi.setText(""+vt.kisiVizeFinalBasariSirasiOgrenme(kisiFinalNotu,EnYuksekBilgileri.enYuksekDersIsim,false));

                     fld_vizeBasariSirasiPaylastigi.setText(""+vt.kisiVizeFinalBasariSirasiPaylastigiKisiSayisiGetirme(kisiVizeNotu,EnYuksekBilgileri.enYuksekDersIsim,true));
                     fld_finalBasariSirasiPaylastigi.setText(""+vt.kisiVizeFinalBasariSirasiPaylastigiKisiSayisiGetirme(kisiFinalNotu,EnYuksekBilgileri.enYuksekDersIsim,false));

                     fld_sinifVizeOrt.setText(""+vt.sinifVizeFinalNotOrtalamasiGonder(EnYuksekBilgileri.enYuksekDersIsim,true));
                     fld_sinifFinalOrt.setText(""+vt.sinifVizeFinalNotOrtalamasiGonder(EnYuksekBilgileri.enYuksekDersIsim,false));

                     fld_sinifDersGenelOrt.setText(""+vt.sinifKisiGenelNotOrtalamasiGonder(EnYuksekBilgileri.enYuksekDersIsim,AktifKullanici.aktifKullaniciID,true));
                     fld_kisiDersGenelOrt.setText(""+vt.sinifKisiGenelNotOrtalamasiGonder(EnYuksekBilgileri.enYuksekDersIsim,AktifKullanici.aktifKullaniciID,false));

                     fld_dersGenelEnyOrt.setText(vt.dersGenelEnyuksekOrtalamaVeyaKisisiniGetir(EnYuksekBilgileri.enYuksekDersIsim,true));
                     fld_dersGenelBirincisi.setText(vt.dersGenelEnyuksekOrtalamaVeyaKisisiniGetir(EnYuksekBilgileri.enYuksekDersIsim,false));

                     fld_dersGenelBasariSiralaman.setText(""+vt.dersGenelBasariSirasiGetir(EnYuksekBilgileri.enYuksekDersIsim,fld_kisiDersGenelOrt.getText()));
                     fld_derstenGecenKisiSayisi.setText(""+vt.derstenGecenKalanKisiSayisiGetir(EnYuksekBilgileri.enYuksekDersIsim,fld_enyFalanToplamKisiSayisi.getText())[0]);
                     fld_derstenKalanKisiSayisi.setText(""+vt.derstenGecenKalanKisiSayisiGetir(EnYuksekBilgileri.enYuksekDersIsim,fld_enyFalanToplamKisiSayisi.getText())[1]);

                }

            }
        });

        tree1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);

               //kayitEkraniGoster();
            }
        });
        btn_hesabimiSil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SilinecekBilgiler.silinecekKisiId=AktifKullanici.aktifKullaniciID;
                silVerKaydir.SilinenVerileriKaydir();
                dispose();
                new GirisEkrani();
            }
        });

        btn_gnoEkle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                do {
                    System.out.println("sa");
                    gnoKayitEkle();
                }while(fld_anlikGnoKayit.getText().isEmpty() || fld_anlikGnoKayit.getText().startsWith("0") || fld_gnoGercerliDonem.getText().isEmpty() || fld_gnoGercerliDonem.getText().startsWith("0"));

            }
        });


        btn_gnoDegis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("gno güncelleme başlatıldı");
                 eskiGnoKayit = fld_anlikGnoKayit.getText();
                 eskiGecerliDonem = Integer.parseInt(fld_gnoGercerliDonem.getText());

                if(fld_anlikGnoKayit.getText().isEmpty() || fld_anlikGnoKayit.getText().startsWith("0")){
                    tamEkranYap(false);
                    JOptionPane.showMessageDialog(JP_Menu,"Kayıtlı Gno'nuz Yok Gno Ekle Kısmını Kullanınız");
                    tamEkranYap(true);
                }else{
                    tamEkranYap(false);
                    String guncelGnoString = JOptionPane.showInputDialog(JP_Menu,"Güncelleyeceğiniz Gno'yu Giriniz (ondalıklı kısım için . kullanınız)");
                    tamEkranYap(true);
                    float guncelGno=Float.parseFloat(guncelGnoString);
                     if(guncelGno<0.0 || guncelGno>4){
                         tamEkranYap(false);
                         JOptionPane.showMessageDialog(JP_Menu,"Gno'nuz 0.00-4.00 Arasında Olmalıdır !!");

                         guncelGnoString=  JOptionPane.showInputDialog(JP_Menu,"Şuanki Gno'nuz Nedir ?(!!ondalık kısım için . kullanınız!!) ");

                         guncelGno= Float.parseFloat(guncelGnoString);
                         tamEkranYap(true);
                     }

                    fld_anlikGnoKayit.setText(guncelGnoString);
                    tamEkranYap(false);
                     String gnoGecerliDonemSt = JOptionPane.showInputDialog(JP_Menu,"Gno'nuzun Geçerli Olduğu Son Dönemi Giriniz(1-2-3)");
                    tamEkranYap(true);
                     int gnoGecerliDonem =Integer.parseInt(gnoGecerliDonemSt);

                     if (gnoGecerliDonem<=0 || 30<gnoGecerliDonem){
                         tamEkranYap(false);
                         JOptionPane.showMessageDialog(JP_Menu,"Gno'nuzun Geçerli Olduğu Son Dönem 1 - 30 Arasında Olmalıdır !!");
                         gnoGecerliDonemSt=  JOptionPane.showInputDialog(JP_Menu,"Gno'nuzun Geçerli Olduğu Son Dönemi Giriniz(1-2-3)");
                         tamEkranYap(true);
                         gnoGecerliDonem= Integer.parseInt(gnoGecerliDonemSt);
                    }

                     fld_gnoGercerliDonem.setText(gnoGecerliDonemSt);
                    //tamEkranYap
                    //device.setFullScreenWindow(this);
                    tamEkranYap(true);
                  //  new TamEkran((JFrame) JP_Menu, true);
                    vt.sistemdekiGnoGuncelle(AktifKullanici.aktifKullaniciID,guncelGnoString,fld_gnoGercerliDonem.getText(),eskiGecerliDonem,eskiGnoKayit);
                }
            }
        });
        chckbx_kayitliDersler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fld_eskiGnoOrtDene.setText("0.00");
                vizeNotlariOrtalamaDene.clear();
                finalNotlariOrtalamaDene.clear();
                vizeEtkiOranlariOrtalamaDene.clear();
                finalEtkiOranlariOrtalamaDene.clear();
                aktslerOrtalamaDene.clear();
                dersIsimleriOrtalamaDene.clear();
                //harfNotlariOrtalamaDene.clear();

                vizeNotlariOrtalamaDeneIntAR.clear();
                finalNotlariOrtalamaDeneIntAR.clear();
                vizeEtkiOranlariOrtalamaDeneIntAR.clear();
                finalEtkiOranlariOrtalamaDeneIntAR.clear();
                aktslerOrtalamaDeneIntAR.clear();
                kisiDonemdekiDersIsimleriAROrtDene.clear();
                harfNotlariDonemdekiAROrtDene.clear();




                fld_sinavNotunaGoreOrt.setText("0");
                fld_sinavNotunaGoreOrt.setVisible(false);
                lbl_sinavNotunaGoreOrt.setVisible(false);
                fld_yno.setVisible(false);
                lbl_yno.setVisible(false);
                fld_yno.setText("0");


              chckbx_rastgeleDersler.setSelected(false);
              chckbx_rastgeleDersler.setEnabled(true);
              chckbx_kayitliDersler.setEnabled(false);

                dersKutulariniGizleOrtDene();
                if (chckbx_100lukNotGirisi.isSelected()){
                    ortalamaHesaplanicakNotTipi="100luk";
                }else{
                    ortalamaHesaplanicakNotTipi="harf";
                }
                dersKutulariniGetirOrtDene(1,ortalamaHesaplanicakNotTipi);

                txt_hangiDonem.setVisible(true);
                spn_getirilecekDonem.setVisible(true);

                txt_kacDersHesaplanicak.setVisible(false);
                spn_hesaplanicakDersSayisi.setVisible(false);


            }
        });
        chckbx_rastgeleDersler.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vizeNotlariOrtalamaDene.clear();
                finalNotlariOrtalamaDene.clear();
                vizeEtkiOranlariOrtalamaDene.clear();
                finalEtkiOranlariOrtalamaDene.clear();
                aktslerOrtalamaDene.clear();
                dersIsimleriOrtalamaDene.clear();
                //harfNotlariOrtalamaDene.clear();

                vizeNotlariOrtalamaDeneIntAR.clear();
                finalNotlariOrtalamaDeneIntAR.clear();
                vizeEtkiOranlariOrtalamaDeneIntAR.clear();
                finalEtkiOranlariOrtalamaDeneIntAR.clear();
                aktslerOrtalamaDeneIntAR.clear();
                kisiDonemdekiDersIsimleriAROrtDene.clear();
                harfNotlariDonemdekiAROrtDene.clear();


                fld_sinavNotunaGoreOrt.setText("0");
                fld_sinavNotunaGoreOrt.setVisible(false);
                lbl_sinavNotunaGoreOrt.setVisible(false);
                fld_yno.setVisible(false);
                lbl_yno.setVisible(false);
                fld_yno.setText("0");
                fld_gno.setVisible(false);
                lbl_gno.setVisible(false);
                fld_gno.setText("0.0");

                txt_dersIsim.setVisible(true);
                txt_akts.setVisible(true);
                txt_vizeNotu.setVisible(true);
                txt_finalNotu.setVisible(true);
                txt_vizeEtkiOrani.setVisible(true);
                txt_finaltkiOrani.setVisible(true);

                dersKutulariniGizleOrtDene();
                if (chckbx_100lukNotGirisi.isSelected()){
                    ortalamaHesaplanicakNotTipi="100luk";
                }else{
                    ortalamaHesaplanicakNotTipi="harf";
                }
                dersKutulariniGetirOrtDene(1,ortalamaHesaplanicakNotTipi);


                  chckbx_kayitliDersler.setSelected(false);
                  chckbx_rastgeleDersler.setEnabled(false);
                  chckbx_kayitliDersler.setEnabled(true);

                  txt_hangiDonem.setVisible(false);
                  spn_getirilecekDonem.setVisible(false);

                  txt_kacDersHesaplanicak.setVisible(true);
                  spn_hesaplanicakDersSayisi.setVisible(true);

            }
        });

        btn_hesaplaOrtalamaDene.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int vizeNotuOrtHesapla=0,finalNotuOrtHesapla=0,vizeEtkiOraniOrtHesapla=0,finalEtkiOraniOrtHesapla=0,aktsOrtHesapla=0,hesaplanicakDersSayisiOrtDene=0;

                try {
                    YnoHesaplaOrtDeneSyf ynoHesaplaOrtDeneSyf;
                    if(chckbx_rastgeleDersler.isSelected()){

                        hesaplanicakDersSayisiOrtDene=Integer.parseInt(spn_hesaplanicakDersSayisi.getValue().toString());

                    }else {
                      hesaplanicakDersSayisiOrtDene = getirilenDonemdekiDersSayisi;
                    }
                    ynoHesaplaOrtDeneSyf =new  YnoHesaplaOrtDeneSyf(hesaplanicakDersSayisiOrtDene,vizeNotlariOrtalamaDene,finalNotlariOrtalamaDene,finalEtkiOranlariOrtalamaDene,vizeEtkiOranlariOrtalamaDene,aktslerOrtalamaDene,temizlenecekComponent,harfNotlariOrtalamaDene,chckbx_harfNotuGirisi.isSelected());

                    ynoHesaplaOrtDeneSyf.dizilereGerekliVerileriEkle(hesaplanicakDersSayisiOrtDene,"akts");

                    if(!chckbx_harfNotuGirisi.isSelected()){

                        ynoHesaplaOrtDeneSyf.dizilereGerekliVerileriEkle(hesaplanicakDersSayisiOrtDene,"vize");
                        ynoHesaplaOrtDeneSyf.dizilereGerekliVerileriEkle(hesaplanicakDersSayisiOrtDene,"final");
                        ynoHesaplaOrtDeneSyf.dizilereGerekliVerileriEkle(hesaplanicakDersSayisiOrtDene,"vizeEtki");
                        ynoHesaplaOrtDeneSyf.dizilereGerekliVerileriEkle(hesaplanicakDersSayisiOrtDene,"finalEtki");

                        for (int index=0;hesaplanicakDersSayisiOrtDene>index;index++) {

                            //String finalStringOrtHesapla = .getText();
                            finalNotuOrtHesapla = Integer.parseInt(finalNotlariOrtalamaDene.get(index).getText());
                            //Integer.parseInt(finalStringOrtHesapla);

                            //String vizeStringOrtHesapla = fld_vize1.getText();
                            vizeNotuOrtHesapla = Integer.parseInt(vizeNotlariOrtalamaDene.get(index).getText());

                            //String vizeEtkiOStringOrtHesapla = fld_vizeEtki1.getText();
                            vizeEtkiOraniOrtHesapla = Integer.parseInt(vizeEtkiOranlariOrtalamaDene.get(index).getText());

                            //String finalEtkiStringOrtHesapla = fld_finalEtki1.getText();
                            finalEtkiOraniOrtHesapla = Integer.parseInt(finalEtkiOranlariOrtalamaDene.get(index).getText());

                            eskiGnoOrtDene = Float.parseFloat(fld_eskiGnoOrtDene.getText());


                            aktsOrtHesapla = (int) aktslerOrtalamaDene.get(index).getValue();
                            //donem=(int) spn_donem.getValue();
                            isNotGirisindeHata = false;

                            if( vizeNotuOrtHesapla <0 || vizeNotuOrtHesapla >100 || fld_vize1.getText() == null){
                                isNotGirisindeHata=true;
                                tamEkranYap(false);
                                JOptionPane.showInternalMessageDialog(null,(index+1)+". Dersinizin Notunda Hata\n!! Vize Notunuz 0-100 Aralığında Olmalılıdır !!");
                                tamEkranYap(true);
                                break;
                            }  if (finalNotuOrtHesapla < 0 || finalNotuOrtHesapla > 100) {
                                isNotGirisindeHata=true;
                                tamEkranYap(false);
                                JOptionPane.showInternalMessageDialog(null,(index+1)+". Dersinizin Notunda Hata\n!! Final Notunuz 0-100 Aralığında Olmalılıdır !!");
                                tamEkranYap(true);
                                break;
                            } if ( (vizeEtkiOraniOrtHesapla + finalEtkiOraniOrtHesapla ) != 100) {
                                isNotGirisindeHata=true;
                                tamEkranYap(false);
                                JOptionPane.showInternalMessageDialog(null,(index+1)+". Dersinizin Etki Oranında Hata\n!! Vize ve Final Etki Oranları Toplamı 100 'ü Vermelidir !!");
                                tamEkranYap(true);
                                break;
                            }  if (aktsOrtHesapla > 30 || aktsOrtHesapla <= 0) {
                                isNotGirisindeHata=true;
                                tamEkranYap(false);
                                JOptionPane.showInternalMessageDialog(null,(index+1)+". Dersinizin Akts Değerinde Hata\n!! Akts Değeriniz 30 'dan Büyük, 0 'a Küçük-Eşit Olamaz !!");
                                tamEkranYap(true);
                                break;
                            }  if ( 0>=eskiGnoOrtDene || 4.0< eskiGnoOrtDene ) {
                                isNotGirisindeHata=true;
                                tamEkranYap(false);
                                JOptionPane.showInternalMessageDialog(null,"!! Eski Gno Değeriniz 4 'den Büyük, 0 'a Küçük-Eşit Olamaz !!");
                                tamEkranYap(true);
                                break;
                            }
                        }

                    }else {

                        ynoHesaplaOrtDeneSyf.dizilereGerekliVerileriEkle(hesaplanicakDersSayisiOrtDene,"harfNotu");

                        eskiGnoOrtDene = Float.parseFloat(fld_eskiGnoOrtDene.getText());

                        for (int index=0;hesaplanicakDersSayisiOrtDene>index;index++) {

                        aktsOrtHesapla = (int) aktslerOrtalamaDene.get(index).getValue();


                        isNotGirisindeHata=false;
                        if ( 0>=eskiGnoOrtDene || 4.0< eskiGnoOrtDene ) {
                            isNotGirisindeHata = true;
                            tamEkranYap(false);
                            JOptionPane.showInternalMessageDialog(null, "!! Eski Gno Değeriniz 4 'den Büyük, 0 'a Küçük-Eşit Olamaz !!");
                            tamEkranYap(true);
                            break;
                        }
                     }
                    }

                } catch (NumberFormatException ex) {
                    isNotGirisindeHata=true;
                    System.out.println(ex.getMessage());

                }

               if(!isNotGirisindeHata){
                   YnoHesaplaOrtDeneSyf.gnoHesapla(eskiGnoOrtDene);

                   if(!chckbx_harfNotuGirisi.isSelected()){

                       fld_sinavNotunaGoreOrt.setText("0.00");
                       lbl_sinavNotunaGoreOrt.setVisible(true);
                       fld_sinavNotunaGoreOrt.setVisible(true);
                       fld_sinavNotunaGoreOrt.setText(String.valueOf(YnoHesaplaOrtDeneSyf.yno100lukOrtDene));

                       fld_gno.setText("0.00");
                       lbl_gno.setVisible(true);
                       fld_gno.setVisible(true);
                       fld_gno.setText(String.valueOf(YnoHesaplaOrtDeneSyf.gno4OrtDene));

                       fld_yno.setText("0.00");
                       lbl_yno.setVisible(true);
                       fld_yno.setVisible(true);
                       fld_yno.setText(String.valueOf(YnoHesaplaOrtDeneSyf.yno4lukOrtDene));
                   }else {

                       fld_sinavNotunaGoreOrt.setText("0.00");
                       lbl_sinavNotunaGoreOrt.setVisible(false);
                       fld_sinavNotunaGoreOrt.setVisible(false);

                       fld_gno.setText("0.00");
                       lbl_gno.setVisible(true);
                       fld_gno.setVisible(true);
                       fld_gno.setText(String.valueOf(YnoHesaplaOrtDeneSyf.gno4OrtDene));

                       fld_yno.setText("0.00");
                       lbl_yno.setVisible(true);
                       fld_yno.setVisible(true);
                       fld_yno.setText(String.valueOf(YnoHesaplaOrtDeneSyf.yno4lukOrtDene));
                   }



                }else {
                   fld_sinavNotunaGoreOrt.setText("0.00");
                   lbl_sinavNotunaGoreOrt.setVisible(false);
                   fld_sinavNotunaGoreOrt.setVisible(false);

                   fld_gno.setVisible(false);
                   lbl_gno.setVisible(false);
                   fld_gno.setText("0.0");


                   fld_yno.setText("0.00");
                   lbl_yno.setVisible(false);
                   fld_yno.setVisible(false);
               }
            }
        });
        btn_dersleriGetir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ortalamaSonucuGizle();
                ortalamaDeneSayfasindakiVerileriTemizle();
                if(chckbx_rastgeleDersler.isSelected()){
                    ortalamaDeneSyfDersleriGetir(chckbx_rastgeleDersler.isSelected(),Integer.parseInt(spn_hesaplanicakDersSayisi.getValue().toString()));
                }else {
                    ortalamaDeneSyfDersleriGetir(chckbx_rastgeleDersler.isSelected(),11);
                }


            }
        });
        // Açılır menü oluşturma
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem option1 = new JMenuItem("Ders bilgileri göster");
        JMenuItem option2 = new JMenuItem("Option 2");
        JMenuItem option3 = new JMenuItem("Option 3");

        // Menüyü popup menüye ekle
        popupMenu.add(option1);
        popupMenu.add(option2);
        popupMenu.add(option3);

        tree1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                // Çift tıklama kontrolü
                if (e.getClickCount() == 2 && SwingUtilities.isLeftMouseButton(e) && !tree1.getSelectionModel().isSelectionEmpty()) {

                    kayitEkraniGoster();
                   JTree jt;
                   jt=(JTree) e.getComponent();

                    TreePath selectedPath = jt.getPathForLocation(e.getX(), e.getY());
                    String dersIsmi="";

                    // Seçilen path'in null olmadığından emin ol
                    if (selectedPath != null) {
                        // Seçilen node'u al (path'in son bileşeni, yani seçilen node)
                        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) selectedPath.getLastPathComponent();

                        // Eğer bu node bir ders ismi ise (altında başka child yoksa), ders ismini al
                        if (selectedNode.isLeaf()) {
                            dersIsmi = selectedNode.toString(); // Ders ismi
                            // Ders ismi ile yapılacak işlemler...
                        } else {
                            System.out.println("Bu bir ders değil, alt öğeleri var.");
                            kayitEkraniGizle();
                        }
                    }

                     /*
                    String gosterilecekDersIsimKayitEkran = jt.getSelectionModel().getLeadSelectionPath().getPathComponent(1).toString();   bu kod önceden dosyaların dönem isimleri olmadan önceki halinde kullanılıyordu.
                    String gosterilecekDersIsimKayitEkran = jt.getModel().getChild( jt.getSelectionModel().getLeadSelectionPath().getPathComponent(1),0).toString();
                    */
                        String gosterilecekDersIsimKayitEkran=dersIsmi;
                        fld_dersIsimKayit.setText(gosterilecekDersIsimKayitEkran);

                   kayitSayfasiSecilenDersBilgileriniGoster(gosterilecekDersIsimKayitEkran);
                }

            }
        });

        chckbx_harfNotuGirisi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                vizeNotlariOrtalamaDene.clear();
                finalNotlariOrtalamaDene.clear();
                vizeEtkiOranlariOrtalamaDene.clear();
                finalEtkiOranlariOrtalamaDene.clear();
                aktslerOrtalamaDene.clear();
                dersIsimleriOrtalamaDene.clear();


                vizeNotlariOrtalamaDeneIntAR.clear();
                finalNotlariOrtalamaDeneIntAR.clear();
                vizeEtkiOranlariOrtalamaDeneIntAR.clear();
                finalEtkiOranlariOrtalamaDeneIntAR.clear();
                aktslerOrtalamaDeneIntAR.clear();
                kisiDonemdekiDersIsimleriAROrtDene.clear();
                harfNotlariDonemdekiAROrtDene.clear();


                fld_sinavNotunaGoreOrt.setText("0");
                fld_sinavNotunaGoreOrt.setVisible(false);
                lbl_sinavNotunaGoreOrt.setVisible(false);
                fld_yno.setVisible(false);
                lbl_yno.setVisible(false);
                fld_yno.setText("0");
                fld_gno.setVisible(false);
                lbl_gno.setVisible(false);
                fld_gno.setText("0.0");

                cmbx_harfNotu1.setVisible(true);
                txt_harfNotuOrtDene.setVisible(true);
                txt_dersIsim.setVisible(true);
                txt_akts.setVisible(true);
                txt_vizeNotu.setVisible(false);
                txt_finalNotu.setVisible(false);
                txt_vizeEtkiOrani.setVisible(false);
                txt_finaltkiOrani.setVisible(false);

                chckbx_100lukNotGirisi.setSelected(false);
                chckbx_100lukNotGirisi.setEnabled(true);
                chckbx_harfNotuGirisi.setEnabled(false);

                revalidate();
                repaint();

                dersKutulariniGizleOrtDene();
                dersKutulariniGetirOrtDene(1,"harf");

            }
        });
        chckbx_100lukNotGirisi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vizeNotlariOrtalamaDene.clear();
                finalNotlariOrtalamaDene.clear();
                vizeEtkiOranlariOrtalamaDene.clear();
                finalEtkiOranlariOrtalamaDene.clear();
                aktslerOrtalamaDene.clear();
                dersIsimleriOrtalamaDene.clear();


                vizeNotlariOrtalamaDeneIntAR.clear();
                finalNotlariOrtalamaDeneIntAR.clear();
                vizeEtkiOranlariOrtalamaDeneIntAR.clear();
                finalEtkiOranlariOrtalamaDeneIntAR.clear();
                aktslerOrtalamaDeneIntAR.clear();
                kisiDonemdekiDersIsimleriAROrtDene.clear();
                harfNotlariDonemdekiAROrtDene.clear();

                for (JComboBox comboBox:harfNotlariOrtalamaDene){
                    comboBox.setVisible(false);
                }


                fld_sinavNotunaGoreOrt.setText("0");
                fld_sinavNotunaGoreOrt.setVisible(false);
                lbl_sinavNotunaGoreOrt.setVisible(false);
                fld_yno.setVisible(false);
                lbl_yno.setVisible(false);
                fld_yno.setText("0");
                fld_gno.setVisible(false);
                lbl_gno.setVisible(false);
                fld_gno.setText("0.0");
                txt_harfNotuOrtDene.setVisible(false);


                txt_dersIsim.setVisible(true);
                txt_akts.setVisible(true);
                txt_vizeNotu.setVisible(true);
                txt_finalNotu.setVisible(true);
                txt_vizeEtkiOrani.setVisible(true);
                txt_finaltkiOrani.setVisible(true);

                chckbx_harfNotuGirisi.setSelected(false);
                chckbx_100lukNotGirisi.setEnabled(false);
                chckbx_harfNotuGirisi.setEnabled(true);

                revalidate();
                repaint();

                dersKutulariniGizleOrtDene();
                dersKutulariniGetirOrtDene(1,"100luk");

            }

        });
    }

}
