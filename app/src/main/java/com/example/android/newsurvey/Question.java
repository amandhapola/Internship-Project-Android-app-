package com.example.android.newsurvey;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public  class Question extends FragmentActivity implements ActionBar.TabListener {

    private ViewPager viewPager;
    private tabsPagerAdapter mAdapter;
    private ActionBar actionBar;
    public  static int i=0;
    public int no_of_ques=6;
    public TextView textView;
    public RadioButton r1;
    public RadioButton r2;
    public RadioButton r3;
    public RadioButton r4;
    public RadioButton r5;
    public RadioButton r6;
    public RadioButton r7;
    public RadioButton r8;
    public RadioButton r9;
    public RadioButton r10;
    public RadioButton r11;
    String ans[]=new String[6];
    ///////////////////////////////////
    private String[] mPlanetTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    // Tab titles
    private String[] tabs = { "Single", "Multi" };
//    dbhelper db_helper=new dbhelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.activity_question);
        viewPager = (ViewPager) findViewById(R.id.pager);
        actionBar = getActionBar();
        actionBar.setTitle("hello");
        mAdapter = new tabsPagerAdapter(getSupportFragmentManager());
//        db_helper.getWritableDatabase();
        viewPager.setAdapter(mAdapter);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        mPlanetTitles = getResources().getStringArray(R.array.planets_array);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.drawer_list_item, mPlanetTitles));
        LayoutInflater inflater=getLayoutInflater();
        ViewGroup mtop=(ViewGroup)inflater.inflate(R.layout.header,mDrawerList,false);
        mDrawerList.addHeaderView(mtop,null,false);



        // Set the list's click listener
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());


        mTitle = mDrawerTitle = getTitle();
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                R.drawable.ic_drawer, R.string.drawer_open, R.string.drawer_close) {

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getActionBar().setTitle(mTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getActionBar().setTitle(mDrawerTitle);
//                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };


        mDrawerLayout.setDrawerListener(mDrawerToggle);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);




        // Adding Tabs
        for (String tab_name : tabs) {
            actionBar.addTab(actionBar.newTab().setText(tab_name)
                    .setTabListener(this));
        }
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                // on changing the page
                // make respected tab selected
                actionBar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
    }
//    @Override
//    public boolean onPrepareOptionsMenu(Menu menu) {
//        // If the nav drawer is open, hide action items related to the content view
//        boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
//        menu.findItem(R.id.action_websearch).setVisible(!drawerOpen);
//        return super.onPrepareOptionsMenu(menu);
//    }
    ///////////////////////////////

    ///////////////////////////////
    contract.questions populate_questions_object(String ques,String c1,String c2,String c3,String c4,String c5,String c6,String c7,String c8,
                                                 String c9,String c10,String c11,String desc,String ans)
    {
        contract.questions q=new contract().new questions(ques,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,desc,ans);
        return q;
    }

    ////////////////////////////////////
    public void onRadioButtonClicked1(View view){
        RadioGroup rg=(RadioGroup)findViewById(R.id.q1_1);
        String radioValue=((RadioButton)this.findViewById(rg.getCheckedRadioButtonId())).getText().toString();
        Toast toast=Toast.makeText(this, radioValue, Toast.LENGTH_SHORT);
        toast.show();
        ans[0]=radioValue;

    }
    public void onRadioButtonClicked2(View view){
        RadioGroup rg=(RadioGroup)findViewById(R.id.q1_2);
        String radioValue=((RadioButton)this.findViewById(rg.getCheckedRadioButtonId())).getText().toString();
        Toast toast=Toast.makeText(this, radioValue, Toast.LENGTH_SHORT);
        toast.show();
        ans[1]=radioValue;

    }
    public void onRadioButtonClicked3(View view){
        RadioGroup rg=(RadioGroup)findViewById(R.id.q1_3);
        String radioValue=((RadioButton)this.findViewById(rg.getCheckedRadioButtonId())).getText().toString();
        Toast toast=Toast.makeText(this, radioValue, Toast.LENGTH_SHORT);
        toast.show();
        ans[2]=radioValue;

    }
    public void onRadioButtonClicked4(View view){
        RadioGroup rg=(RadioGroup)findViewById(R.id.q1_4);
        String radioValue=((RadioButton)this.findViewById(rg.getCheckedRadioButtonId())).getText().toString();
        Toast toast=Toast.makeText(this, radioValue, Toast.LENGTH_SHORT);
        toast.show();
        ans[3]=radioValue;

    }
    public void onRadioButtonClicked5(View view){
        RadioGroup rg=(RadioGroup)findViewById(R.id.q1_5);
        String radioValue=((RadioButton)this.findViewById(rg.getCheckedRadioButtonId())).getText().toString();
        Toast toast=Toast.makeText(this, radioValue, Toast.LENGTH_SHORT);
        toast.show();
        ans[4]=radioValue;
    }
    public void onRadioButtonClicked6(View view){
        RadioGroup rg=(RadioGroup)findViewById(R.id.q1_6);
        String radioValue=((RadioButton)this.findViewById(rg.getCheckedRadioButtonId())).getText().toString();
        Toast toast=Toast.makeText(this, radioValue, Toast.LENGTH_SHORT);
        toast.show();
        ans[5]=radioValue;
    }
    public String getEditTextValue(int id){
        EditText desc=(EditText)findViewById(id);
        return desc.getText().toString();
    }
/////////////////////////////////////////////////////////////
public void next(View view)
{
    textView=(TextView)findViewById(R.id.question);
    RadioGroup rg=(RadioGroup)findViewById(R.id.q);
    r1=(RadioButton)findViewById(R.id.c1);
    r2=(RadioButton)findViewById(R.id.c2);
    r3=(RadioButton)findViewById(R.id.c3);
    r4=(RadioButton)findViewById(R.id.c4);
    r5=(RadioButton)findViewById(R.id.c5);
    r6=(RadioButton)findViewById(R.id.c6);
    r7=(RadioButton)findViewById(R.id.c7);
    r8=(RadioButton)findViewById(R.id.c8);
    r9=(RadioButton)findViewById(R.id.c9);
    r10=(RadioButton)findViewById(R.id.c10);
    r11=(RadioButton)findViewById(R.id.c11);
    dbhelper db=new dbhelper(this);
    db.getReadableDatabase();
    contract.questions q=new contract().new questions();
    int temp=(i+1)%no_of_ques;
    if (temp==0){
        temp=1;
    }
    q=db.get_row_object(temp);
    textView.setText(q.question);
    if (q.c1==" "){
        r1.setVisibility(View.GONE);
        r1.setButtonDrawable(android.R.color.transparent);
        r1.setEnabled(false);
    }
    else{r1.setText(q.c1);}

    if (q.c2==" "){
        r2.setVisibility(View.GONE);
        r2.setButtonDrawable(android.R.color.transparent);
        r2.setEnabled(false);
    }
    else{r2.setText(q.c2);}

    if (q.c3==" "){
        r3.setVisibility(View.GONE);
        r3.setButtonDrawable(android.R.color.transparent);
        r3.setEnabled(false);
    }
    else{r3.setText(q.c3);}

    if (q.c4==" "){
        r4.setVisibility(View.GONE);
        r4.setButtonDrawable(android.R.color.transparent);
        r4.setEnabled(false);
    }
    else{r4.setText(q.c4);}

    if (q.c5==" "){
        r5.setVisibility(View.GONE);
        r5.setButtonDrawable(android.R.color.transparent);
        r5.setEnabled(false);
    }
    else{r5.setText(q.c5);}

    if (q.c6==" "){
        r6.setVisibility(View.GONE);
        r6.setButtonDrawable(android.R.color.transparent);
        r6.setEnabled(false);
    }
    else{r6.setText(q.c6);}

    if (q.c7==" "){

        r7.setVisibility(View.GONE);
        r7.setButtonDrawable(android.R.color.transparent);
        r7.setEnabled(false);
    }
    else{r7.setText(q.c7);}

    if (q.c8==" "){
        r8.setVisibility(View.GONE);
        r8.setButtonDrawable(android.R.color.transparent);
        r8.setEnabled(false);
    }
    else{r8.setText(q.c8);}

    if (q.c9==" "){
        r9.setVisibility(View.GONE);
        r9.setButtonDrawable(android.R.color.transparent);
        r9.setEnabled(false);
    }
    else{r9.setText(q.c9);}

    if (q.c10==" "){
        r10.setVisibility(View.GONE);
        r10.setButtonDrawable(android.R.color.transparent);
        r10.setEnabled(false);
    }
    else{r10.setText(q.c10);}

    if (q.c11==" "){
        r11.setVisibility(View.GONE);
        r11.setButtonDrawable(android.R.color.transparent);
        r11.setEnabled(false);
    }
    else{r11.setText(q.c11);}
    for (int j=0;j<rg.getChildCount();j++){
        RadioButton r= (RadioButton) rg.getChildAt(i);
        if (r.getText()== " "){rg.removeViewAt(i);}
    }
    i++;
}

    //////////////////////////////////////////////////////////
    //////////////////////////////////
    public void save(View v){
        dbhelper db_helper=new dbhelper(this);
//        db_helper.getWritableDatabase();
        String desc5=getEditTextValue(R.id.q5_desc);
        String desc6=getEditTextValue(R.id.q6_desc);
        for (int i=0;i<6;i++)
        {
            if (i==4 || i==5)
            {
                if (i==4){
                    db_helper.updateRow(ans[i],desc5,i+1);
                }
                else if(i==5){
                    db_helper.updateRow(ans[i],desc6,i+1);
                }
            }
            else{
                db_helper.updateRow(ans[i]," ",i+1);
            }

        }
        Toast toast=Toast.makeText(this,"thanks your response has been saved",Toast.LENGTH_LONG);
        toast.show();
    }
    ////////////////////////////////////

    @Override
    public void onTabReselected(Tab tab, FragmentTransaction ft) {
    }

    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        // on tab selected
        // show respected fragment view
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
    }

//////////////////////////
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_question, menu);
        return super.onCreateOptionsMenu(menu);
    }
//////////////////////////
@Override
protected void onPostCreate(Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    // Sync the toggle state after onRestoreInstanceState has occurred.
    mDrawerToggle.syncState();
}

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }


    ////////////////////////
@Override
    public boolean onOptionsItemSelected(MenuItem item) {

    if (mDrawerToggle.onOptionsItemSelected(item)) {
        return true;
    }
        switch (item.getItemId()){
            case R.id.recycle:
                dbhelper db=new dbhelper(getApplicationContext());
                for (int i=0;i<db.getCount();i++){
                    db.updateRow(" "," ",i+1);
                }
                Toast toast=Toast.makeText(this,"refreshed answers in database",Toast.LENGTH_LONG);
                toast.show();
                return true;
            case (R.id.action_settings):
                return true;

            default: return super.onOptionsItemSelected(item);
        }
    }


    ////////////////////////////////////////////////
    public class tabsPagerAdapter extends FragmentPagerAdapter {
        public tabsPagerAdapter(FragmentManager fm){
            super(fm);
        }
        @Override
        public Fragment getItem(int index){
            switch (index){
                case 0:
                    return  new singleFragment();
                case  1:
                    return new multiFragment();
            }
            return null;
        }
        @Override
        public int getCount(){
            return  2;
        }
    }
    ///////////////////////////////////////////////


    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        public DrawerItemClickListener(){

        }
        @Override
        public void onItemClick(AdapterView parent, View view, int position, long id) {
            selectItem(position);
        }

    }


    private void selectItem(int position)
    {
        if (position==1){
            Intent intent=new Intent(Question.this,choice.class);
            startActivity(intent);
        }

    }

}
