package com.excample.retno.asmaulhusna;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView lvlisthusna;

    String[] indohusna ={
            " Ar Rahman\n" +
                    "\t\n" +
                    "Allah Yang Maha Pengasih"            ," Ar Rahiim\n" +
            "\t\n" +
            "Allah Yang Maha Penyayang"            ," Al Malik\n" +
            "\t\n" +
            "Allah Yang Maha Merajai (bisa di artikan Raja dari semua Raja)"            ," Al Quddus\n" +
            "\t\n" +
            "Allah Yang Maha Suci"            ," As Salaam\n" +
            "\t\n" +
            "Allah Yang Maha Memberi Kesejahteraan"            ," Al Mu`min\n" +
            "\t\n" +
            "Allah Yang Maha Memberi Keamanan"            ," Al Muhaimin\n" +
            "\t\n" +
            "Allah Yang Maha Mengatur"            ," Al `Aziiz\n" +
            "\t\n" +
            "Allah Yang Maha Perkasa"            ,"Al Jabbar\n" +
            "\t\n" +
            "Allah Yang Memiliki Mutlak Kegagahan"            ," Al Mutakabbir\n" +
            "\t\n" +
            "Allah Yang Maha Megah, Yang Memiliki Kebesaran"            ," Al Khaliq\n" +
            "\t\n" +
            "Allah Yang Maha Pencipta"            ," Al Baari`\n" +
            "\t\n" +
            "Allah Yang Maha Melepaskan (Membuat, Membentuk, Menyeimbangkan)"            ," Al Mushawwir\n" +
            "\t\n" +
            "Allah Yang Maha Membentuk Rupa (makhluknya)"            ," Al Ghaffaar\n" +
            "\t\n" +
            "Allah Yang Maha Pengampun"            ," Al Qahhaar\n" +
            "\t\n" +
            "Allah Yang Maha Menundukkan / Menaklukkan Segala Sesuatu"            ," Al Wahhaab\n" +
            "\t\n" +
            "Allah Yang Maha Pemberi Karunia"            ," Ar Razzaaq\n" +
            "\t\n" +
            "Allah Yang Maha Pemberi Rezeki"            ," Al Fattaah\n" +
            "\t\n" +
            "Allah Yang Maha Pembuka Rahmat"            ," Al `Aliim\n" +
            "\t\n" +
            "Allah Yang Maha Mengetahui (Memiliki Ilmu)"            ," Al Qaabidh\n" +
            "\t\n" +
            "Allah Yang Maha Menyempitkan (makhluknya)"            ," Al Baasith\n" +
            "\t\n" +
            "Allah Yang Maha Melapangkan (makhluknya)"            ," Al Khaafidh\n" +
            "\t\n" +
            "Allah Yang Maha Merendahkan (makhluknya)"            ," Ar Raafi`\n" +
            "\t\n" +
            "Allah Yang Maha Meninggikan (makhluknya)"            ," Al Mu`izz\n" +
            "\t\n" +
            "Allah Yang Maha Memuliakan (makhluknya)"            ," Al Mudzil\n" +
            "\t\n" +
            "Allah Yang Maha Menghinakan (makhluknya)"            ," Al Samii`\n" +
            "\t\n" +
            "Allah Yang Maha Mendengar"            ," Al Bashiir\n" +
            "\t\n" +
            "Allah Yang Maha Melihat"            ," Al Hakam\n" +
            "\t\n" +
            "Allah Yang Maha Menetapkan"            ," Al `Adl\n" +
            "\t\n" +
            "Allah Yang Maha Adil"            ," Al Lathiif\n" +
            "\t\n" +
            "Allah Yang Maha Lembut"            ," Al Khabiir\n" +
            "\t\n" +
            "Allah Yang Maha Mengenal"            ," Al Haliim\n" +
            "\t\n" +
            "Allah Yang Maha Penyantun"            ," \t\n" +
            "Al `Azhiim\n" +
            "\t\n" +
            "Allah Yang Maha Agung"            ," Al Ghafuur\n" +
            "\t\n" +
            "Allah Yang Maha Memberi Pengampunan"            ," As Syakuur\n" +
            "\t\n" +
            "Allah Yang Maha Pembalas Budi (Menghargai)"            ," Al `Aliy\n" +
            "\t\n" +
            "Allah Yang Maha Tinggi"            ," Al Kabiir\n" +
            "\t\n" +
            "Allah Yang Maha Besar"            ," Al Hafizh\n" +
            "\t\n" +
            "Allah Yang Maha Memelihara"            ," Al Muqiit\n" +
            "\t\n" +
            "Allah Yang Maha Pemberi Kecukupan"            ," Al Hasiib\n" +
            "\t\n" +
            "Allah Yang Maha Membuat Perhitungan"
    };

    String [] arabhusna ={
            "الرحمن"            ,"الرحيم"            ,"الملك"            ,"القدوس"            ,"السلام"            ,"المؤمن"            ,"المهيمن"            ,"العزيز"            ,"الجبار"            ,"المتكبر"            ,"الخالق"            ,"البارئ"            ,"المصور"            ,"الغفار"            ,"القهار"            ," الوهاب"            ,"الرزاق"            ,"الفتاح"            ,"العليم"            ,"القابض"            ,"الباسط"            ,"الخافض"            ,"الرافع"            ,"المعز"            ,"المذل"            ,"السميع"            ,"البصير"            ,"الحكم"            ,"العدل"            ,"اللطيف"            ,"الخبير"            ,"الحليم"            ,"العظيم"            ,"الغفور"            ,"الشكور"            ,"العلى"            ,"الكبير"            ,"الحفيظ"            ,"المقيت"            ,"الحسيب"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvlisthusna = (ListView)findViewById(R.id.lvlisthusna);
        AsmaulAdapter asmaulAdapter = new AsmaulAdapter(this, indohusna, arabhusna);
        lvlisthusna.setAdapter(asmaulAdapter);
    }
}



