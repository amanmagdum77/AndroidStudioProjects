package com.example.listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ScrollView;
import android.widget.TextView;

public class Shikamaru extends AppCompatActivity {


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shikamaru);

        textView = (TextView)findViewById(R.id.text1);

        String para = "Shikamaru"+"Shikamaru is the only child of Yoshino and Shikaku Nara. When he was young, he once played \"ninja\" with other children his age. Ch\u014dji Akimichi wanted to play with them, but the other children refused to allow him to do so, claiming he was too stupid to participate. When Shikamaru couldn't convince the others to let Ch\u014dji join, he left the game and went to his favourite spot to watch clouds. Ch\u014dji happened to be sitting in the same spot when he got there, so Shikamaru introduced himself, and invited Ch\u014dji to watch the clouds with him. Ch\u014dji asked Shikamaru if he wanted some snacks.[8] From that point onward they were best friends; upon entering Konoha's Ninja Academy, they'd usually sit together in class and hang out afterwards. Shikamaru had very little interest in the class itself, preferring to spend his time sleeping rather than listen to Iruka Umino's lessons.[9] Shikamaru showed the same lack of enthusiasm for the tests he was given and couldn't be bothered to actually answer the questions, leading to his poor grades.[10]\n" +
                "\n" +
                "Personality\n" +
                "Shikamaru is naturally a lazy person and his inclination is to do as little work as possible. As an Academy student and even during his early career as a genin, Shikamaru is able to get away with this, spending his days sleeping, watching the clouds, or playing games of shōgi and Go. His goal is to live unremarkably, free of anything of noticeably good or bad, and then to die just as unremarkably as he lived.[11] When he is faced with the potential for conflict or commitment, he responds first by saying, \"how troublesome,\" and then by trying to find some way out of it, either by pretending to be indisposed or even outright saying that he doesn't want to do whatever it is.[12]\n" +
                "\n" +
                "Although Shikamaru describes himself as \"the number one coward\",[13] he has a strong moral compass and dedication to his friends. It is these qualities that earned Chōji Akimichi's friendship, as Shikamaru was one of the first people to look past his weight and find value in who he naturally was.[8] It is also these qualities that force Shikamaru to move away from his lazy pursuits, as he finds himself volunteering to do work or to sacrifice himself if it will in some way benefit his allies.[13] Such selflessness, once displayed during the Konoha Crush, exacerbates his \"troublesome\" situations: he is given the responsibility of leading his friends into battle, for which reason he does everything that he can to keep them safe, for which reason he is given even more responsibility over even more of his friends, and so on. He still clings to his lazy origins as much as he can; even if he can't spend his entire day being idle, he at least avoids having long-term goals or confessing any particular pleasure in the duties he's assigned.\n" +
                "\n" +
                "Shikamaru undergoes a rapid maturity after the death of his teacher, Asuma Sarutobi, whose loss forces Shikamaru to recognise that the world is not safe that he cannot be kept protected from it forever. After avenging Asuma, Shikamaru takes it upon himself to do all that he can to make things better for future Konoha generations, especially Asuma's then-unborn daughter, Mirai; such is the Will of Fire. He may still balk at the prospect of the work he must do, but he no longer runs from it, even going so far as to argue in favour of difficult choices if it will guarantee his friends' and village's survival.[14] In Shikamaru Hiden, he describes his new goal in life as, rather than living unremarkably himself and watching the clouds all the time, to instead make a world where his children or grandchildren can live that way if they choose to.\n" +
                "\n" +
                "Shikamaru&#039;s dream\n" +
                "Shikamaru dreams of no marriage.\n" +
                "\n" +
                "One of the more \"troublesome\" things that runs throughout Shikamaru's life is the subject of women thanks to his experiences with the women he knows: his mother, Yoshino, his teammate, Ino Yamanaka, and his frequent companion, Temari. He describes each of them as aggressive, demanding, and sometimes even scary. Shikamaru tries to treat women delicately, being non-confrontational or at least polite to them and never asking anything of them that he believes he can do himself. During Part I, he generally believes he can do anything himself, and as such is mortified if and when a woman needs to assist him in any way; his frustrations are similar when he repeatedly finds himself facing female opponents.[15] Because his father, Shikaku, has similar views and experiences with women, Shikamaru asks him for help in understanding them. Shikaku explains that men destroy themselves without a woman's influence and that women, despite how they may act, are kind to the men they love.[16] As with most things, Shikamaru resists entanglements with women as much as he can; his Infinite Tsukuyomi dream world sees him successfully avoiding marriage entirely. However, upon realising in Shikamaru Hiden that Temari is one of the most important things in the world to him, he ultimately marries her and even has a son with her, Shikadai. Ironically, his relationship with Temari became very similar to his parents, where he once mocked Shikaku for being \"whipped\", which he himself became.\n" +
                "\n" +
                "Overtime, having come to recognise Naruto's great contributions to the village despite his own hardships, Shikamaru came to sympathise for him, deciding to be there to support him much like the Second Hokage did for his older brother. His newfound goal became to aid Naruto in his goal of becoming Hokage and act as his personal adviser. Ultimately, as an adult, Shikamaru succeeds in this goal, often handling many duties to lighten the workload for Naruto as Hokage. At the same time, he still holds much of his original carefree nature from youth. He is not very strict with his son, viewing his acting out and/or punishments at school as a learning curve for him, trusting that Shikadai will find his way.";

                textView.setText(para);
                textView.setMovementMethod(new ScrollingMovementMethod());

    }
}