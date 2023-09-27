package com.example.asan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asan.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.konullu.setOnClickListener {
            binding.imageView5.setImageResource(R.drawable.asanxidmetinfounactive)
            binding.konullu.setImageResource(R.drawable.akinfoactive)
            binding.basliq.text="“Könüllü fəaliyyəti” haqqında ümumi məlumat"
            binding.textView7.text="“Könüllü fəaliyyət haqqında” Azərbaycan Respublikasının Qanununa müvafiq olaraq “ASAN xidmət” mərkəzlərində fəaliyyətə başladığı ilk gündən ictimai və sosial məsuliyyəti artıran könüllülük fəaliyyəti həyata keçirilir. Könüllülük fəaliyyəti Azərbaycan Respublikasının qanunvericiliyi ilə qadağan edilməyən, işlərin görülməsi və ya xidmətlərin göstərilməsi ilə bağlı ictimai faydalı və gəlirsiz fəaliyyət hesab olunur. Qanuna müvafiq olaraq “ASAN xidmət” mərkəzlərində könüllü fəaliyyətin əsas etibarı ilə aşağıdakı istiqamətlər üzrə təşkil olunur:\nKönüllülük fəaliyyətinə şəxslər 2 ay müddətinə qoşulur və müxtəlif əmək vərdişləri aşılayan təlimlərdə iştirak edir. Mərkəzlər üzrə gündəlik olaraq 3 növbədə könüllülük fəaliyyəti təşkil olunur və könüllülər istədikləri növbə üzrə fəaliyyətə qoşula bilər. Növbələrin bölgüsü aşağıdakı kimidir:09:00-12:30 – Birinci növbə 12:30-15:30– İkinci növbə 15:30-18:00– Üçüncü növbə"

        }
        binding.imageView5.setOnClickListener {
            binding.imageView5.setImageResource(R.drawable.asanxidmatinfoactive)
            binding.konullu.setImageResource(R.drawable.konullu)
            binding.basliq.text="“ASAN xidmət” mərkəzləri haqqında ümumi məlumat"
            binding.textView7.text= "“ASAN xidmət” mərkəzləri Azərbaycan Respublikasının Prezidenti yanında Vətəndaşlara Xidmət və Sosial İnnovasiyalar üzrə Dövlət Agentliyinin tabeliyində Azərbaycan Respublikası Prezidentinin 2012-ci il 13 iyul tarixli 685 nömrəli Fərmanına əsasən yaradılmışdır. “ASAN xidmət” mərkəzləri dövlət orqanları tərəfindən göstərilən xidmətlərin vahid və əlaqələndirilmiş formada həyata keçirilməsini təmin edən qurumlardır. “ASAN xidmət” mərkəzləri dövlət qulluqçularının fəaliyyətində əhaliyə münasibətdə vətəndaş məmnunluğunun təmin edilməsi istiqamətində yeni yanaşmanın formalaşdırılmasına, ölkədə dövlət qulluqçusu-vətəndaş münasibətlərinin keyfiyyətcə yeni müstəviyə keçməsinə xidmət edir. Mərkəzlərin fəaliyyəti operativlik, şəffaflıq, nəzakətlilik, məsuliyyət və rahatlıq prinsipləri əsasında qurulur.\n“ASAN xidmət” mərkəzlərinin yaradılmasında məqsəd:\n vətəndaşların əlavə xərclərinin və vaxt itkisinin azalması; vətəndaşlara münasibətdə etik qaydalara, nəzakətli davranışa əməl edilməsinə nail olunması; peşəkarlıq səviyyəsinin artırılması; dövlət strukturlarına etimadın daha da gücləndirilməsi; şəffaflığın artırılması, korrupsiyaya qarşı mübarizənin gücləndirilməsi; elektron xidmətlərdən daha geniş istifadə olunması; bu sahədə aparılan institusional islahatların səmərəliliyinin artırılması."
        }
        binding.back.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        binding.eventmenu.setOnClickListener {
            val intent=Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }
        binding.accountmenu.setOnClickListener {
            val intent=Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }
    }
}