package com.loc.myapplication.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.loc.myapplication.R;

/**
 * Created by loc on 06/12/2015.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.Viewhole> {


    Context context;

//    int[] imgList = {
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo,
//            R.drawable.demo
//    };


    String titles[] = {
            "However, since we’re redesigning a major social network, this step wasn’t necessary either, so I went ahead and drew this user flow along with some common use cases. As you can see in the image above, Twitter has laid out its features in a very straightforward way.\n",
            "We have:\n" +
                    "the main screen, which is the Timeline where we can see the tweets of the people we follow and, consecutively,\n" +
                    "these peoples’ profiles\n" +
                    "notifications for interactions with our tweets or profiles\n" +
                    "direct messages (self-explanatory)\n" +
                    "the current Trends which works together with the search functionality (we’ll talk about this later)",
            "The use cases depict different kind of activities when using the Twitter app. Be it endless scrolling, checking out replies, just tweeting and not interacting at all, and even a case where the user is not even using the Twitter app. Notice how in the last two use cases the user can stop engaging at any point.\n" +
                    "Sketching\n" +
                    "Okay, let’s start designing! Now’s the part where we have to accommodate the user flow to Android patterns that Android users are familiar with. The top choices were either tabs or a navigation drawer. After exploring each of these options, I took a step back to think of how users perceive the relation between a website and its phone app.\n",
            "However, since we’re redesigning a major social network, this step wasn’t necessary either, so I went ahead and drew this user flow along with some common use cases. As you can see in the image above, Twitter has laid out its features in a very straightforward way.\n" +
                    "We have:\n" +
                    "the main screen, which is the Timeline where we can see the tweets of the people we follow and, consecutively,\n" +
                    "these peoples’ profiles\n" +
                    "notifications for interactions with our tweets or profiles\n" +
                    "direct messages (self-explanatory)\n" +
                    "the current Trends which works together with the search functionality (we’ll talk about this later)\n" +
                    "and our own Profile which is essentially like any other profile\n" +
                    "The use cases depict different kind of activities when using the Twitter app. Be it endless scrolling, checking out replies, just tweeting and not interacting at all, and even a case where the user is not even using the Twitter app. Notice how in the last two use cases the user can stop engaging at any point.\n" +
                    "Sketching\n" +
                    "Okay, let’s start designing! Now’s the part where we have to accommodate the user flow to Android patterns that Android users are familiar with. The top choices were either tabs or a navigation drawer. After exploring each of these options, I took a step back to think of how users perceive the relation between a website and its phone app.\n",
            "The website is usually a service’s starting point. Users perceive the website to be the brain of the network, while mobile apps are “convenient ways” to transfer the content to their hands.So it’s important that apps act like mirrors of the website they’re serving. As such, both platform need to behave in such way that users won’t have to relearn everything, essentially forming what we call cross-platform consistency.",
            "With Twitter’s website using tabs, the alternative was out of the question. On first launching the app, users will immediately recognize the icons and they will instantly know what content to expect on each tab. I could have used text labels instead of icons, but icons reinforce brand and that’s exactly what makes them instantly recognizable.\n" +
                    "Most Android apps use right-side drawers or panels to show notifications, so we lose a few points for not keeping track with other Android apps. But for the sake of consistency we’ll use a tab here.\n" +
                    "This Action Bar accommodates all of Twitter’s navigation, as you can see all the top screens in the user flow diagram are accessible through this single element that works as a center point for getting around in the app.\n",
            "Title Demo",
            "Title Demo",
            "Title Demo",
            "Title Demo",
            "Title Demo",
            "Title Demo",
            "Title Demo",
            "Title Demo",
            "Title Demo",
            "Title Demo",
            "Title Demo",
            "Title Demo",
            "Title Demo",
            "Title Demo"
    };

    public Adapter(Context context) {

        this.context = context;
    }


    @Override
    public Viewhole onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);
        Viewhole viewhole = new Viewhole(view);
        return viewhole;
    }

    @Override
    public void onBindViewHolder(Viewhole h, int position) {


//        h.img.setImageResource(imgList[position]);
        h.txt.setText(titles[position]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    public static class Viewhole extends RecyclerView.ViewHolder {

        ImageView img;
        TextView txt;

        public Viewhole(View itemView) {
            super(itemView);

//            img = (Im?ageView) itemView.findViewById(R.id.img);
            txt = (TextView) itemView.findViewById(R.id.title);


        }
    }
}
