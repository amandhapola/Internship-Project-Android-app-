package com.example.android.newsurvey;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;


public class multiFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_multi_fragment, container, false);
        dbhelper db=new dbhelper(getActivity());
        contract.questions temp=new contract().new questions();
        System.out.println(db.getCount());
        temp=db.get_row_object(2);
        int count=db.getCount();
        System.out.println(temp.question);
        System.out.println(count);
        contract.questions q[]=new contract.questions[count];
        for (int i=0;i<count;i++)
        {
            System.out.println("inside loop");
            contract.questions temp1;
            temp1 = new contract().new questions();
            temp1=db.get_row_object(i+1);
            q[i]=new contract().new questions();
            q[i].question=temp1.question; //important
            q[i].c1=temp1.c1;
            q[i].c2=temp1.c2;
            q[i].c3=temp1.c3;
            q[i].c4=temp1.c4;
            q[i].c5=temp1.c5;
            q[i].c6=temp1.c6;
            q[i].c7=temp1.c7;
            q[i].c8=temp1.c8;
            q[i].c9=temp1.c9;
            q[i].c10=temp1.c10;
            q[i].c11=temp1.c11;
        }
        TextView textView1=(TextView) rootView.findViewById(R.id.question1);
        RadioButton r1_1=(RadioButton) rootView.findViewById(R.id.q1_1_1);
        RadioButton r1_2=(RadioButton) rootView.findViewById(R.id.q1_1_2);
        RadioButton r1_3=(RadioButton) rootView.findViewById(R.id.q1_1_3);
        RadioButton r1_4=(RadioButton) rootView.findViewById(R.id.q1_1_4);
        RadioButton r1_5=(RadioButton) rootView.findViewById(R.id.q1_1_5);
        RadioButton r1_6=(RadioButton) rootView.findViewById(R.id.q1_1_6);
        RadioButton r1_7=(RadioButton) rootView.findViewById(R.id.q1_1_7);
        textView1.setText(q[0].question);
        r1_1.setText(q[0].c1);
        r1_2.setText(q[0].c2);
        r1_3.setText(q[0].c3);
        r1_4.setText(q[0].c4);
        r1_5.setText(q[0].c5);
        r1_6.setText(q[0].c6);
        r1_7.setText(q[0].c7);
        //////////////////////////////////////////////////////////////////
        TextView textView2=(TextView) rootView.findViewById(R.id.question2);
        RadioButton r2_1=(RadioButton) rootView.findViewById(R.id.q1_2_1);
        RadioButton r2_2=(RadioButton) rootView.findViewById(R.id.q1_2_2);
        RadioButton r2_3=(RadioButton) rootView.findViewById(R.id.q1_2_3);
        RadioButton r2_4=(RadioButton) rootView.findViewById(R.id.q1_2_4);
        RadioButton r2_5=(RadioButton) rootView.findViewById(R.id.q1_2_5);
        RadioButton r2_6=(RadioButton) rootView.findViewById(R.id.q1_2_6);
        RadioButton r2_7=(RadioButton) rootView.findViewById(R.id.q1_2_7);
        textView2.setText(q[0].question);
        r2_1.setText(q[1].c1);
        r2_2.setText(q[1].c2);
        r2_3.setText(q[1].c3);
        r2_4.setText(q[1].c4);
        r2_5.setText(q[1].c5);
        r2_6.setText(q[1].c6);
        r2_7.setText(q[1].c7);
        //////////////////////////////////////////////////////////////////
        TextView textView3=(TextView) rootView.findViewById(R.id.question3);
        RadioButton r3_1=(RadioButton) rootView.findViewById(R.id.q1_3_1);
        RadioButton r3_2=(RadioButton) rootView.findViewById(R.id.q1_3_2);
        RadioButton r3_3=(RadioButton) rootView.findViewById(R.id.q1_3_3);
        RadioButton r3_4=(RadioButton) rootView.findViewById(R.id.q1_3_4);
        RadioButton r3_5=(RadioButton) rootView.findViewById(R.id.q1_3_5);
        textView3.setText(q[2].question);
        r3_1.setText(q[2].c1);
        r3_2.setText(q[2].c2);
        r3_3.setText(q[2].c3);
        r3_4.setText(q[2].c4);
        r3_5.setText(q[2].c5);
        ///////////////////////////////////////////////////////////////////
        TextView textView4=(TextView) rootView.findViewById(R.id.question4);
        RadioButton r4_1=(RadioButton) rootView.findViewById(R.id.q1_4_1);
        RadioButton r4_2=(RadioButton) rootView.findViewById(R.id.q1_4_2);
        RadioButton r4_3=(RadioButton) rootView.findViewById(R.id.q1_4_3);
        RadioButton r4_4=(RadioButton) rootView.findViewById(R.id.q1_4_4);
        RadioButton r4_5=(RadioButton) rootView.findViewById(R.id.q1_4_5);
        RadioButton r4_6=(RadioButton) rootView.findViewById(R.id.q1_4_6);
        RadioButton r4_7=(RadioButton) rootView.findViewById(R.id.q1_4_7);
        RadioButton r4_8=(RadioButton) rootView.findViewById(R.id.q1_4_8);
        RadioButton r4_9=(RadioButton) rootView.findViewById(R.id.q1_4_9);
        RadioButton r4_10=(RadioButton) rootView.findViewById(R.id.q1_4_10);
        RadioButton r4_11=(RadioButton) rootView.findViewById(R.id.q1_4_11);
        textView4.setText(q[3].question);
        r4_1.setText(q[3].c1);
        r4_2.setText(q[3].c2);
        r4_3.setText(q[3].c3);
        r4_4.setText(q[3].c4);
        r4_5.setText(q[3].c5);
        r4_6.setText(q[3].c6);
        r4_7.setText(q[3].c7);
        r4_8.setText(q[3].c8);
        r4_9.setText(q[3].c9);
        r4_10.setText(q[3].c10);
        r4_11.setText(q[3].c11);
        /////////////////////////////////////////////////////////////////////
        TextView textView5=(TextView) rootView.findViewById(R.id.question5);
        RadioButton r5_1=(RadioButton) rootView.findViewById(R.id.q1_5_1);
        RadioButton r5_2=(RadioButton) rootView.findViewById(R.id.q1_5_2);
        RadioButton r5_3=(RadioButton) rootView.findViewById(R.id.q1_5_3);
        RadioButton r5_4=(RadioButton) rootView.findViewById(R.id.q1_5_4);
        RadioButton r5_5=(RadioButton) rootView.findViewById(R.id.q1_5_5);
        RadioButton r5_6=(RadioButton) rootView.findViewById(R.id.q1_5_6);
        RadioButton r5_7=(RadioButton) rootView.findViewById(R.id.q1_5_7);
        RadioButton r5_8=(RadioButton) rootView.findViewById(R.id.q1_5_8);
        textView5.setText(q[4].question);
        r5_1.setText(q[4].c1);
        r5_2.setText(q[4].c2);
        r5_3.setText(q[4].c3);
        r5_4.setText(q[4].c4);
        r5_5.setText(q[4].c5);
        r5_6.setText(q[4].c6);
        r5_7.setText(q[4].c7);
        r5_8.setText(q[4].c8);
        ////////////////////////////////////////////////////////////////////////
        TextView textView6=(TextView) rootView.findViewById(R.id.question6);
        RadioButton r6_1=(RadioButton) rootView.findViewById(R.id.q1_6_1);
        RadioButton r6_2=(RadioButton) rootView.findViewById(R.id.q1_6_2);
        RadioButton r6_3=(RadioButton) rootView.findViewById(R.id.q1_6_3);
        RadioButton r6_4=(RadioButton) rootView.findViewById(R.id.q1_6_4);
        RadioButton r6_5=(RadioButton) rootView.findViewById(R.id.q1_6_5);
        RadioButton r6_6=(RadioButton) rootView.findViewById(R.id.q1_6_6);
        RadioButton r6_7=(RadioButton) rootView.findViewById(R.id.q1_6_7);
        RadioButton r6_8=(RadioButton) rootView.findViewById(R.id.q1_6_8);
        textView6.setText(q[5].question);
        r6_1.setText(q[5].c1);
        r6_2.setText(q[5].c2);
        r6_3.setText(q[5].c3);
        r6_4.setText(q[5].c4);
        r6_5.setText(q[5].c5);
        r6_6.setText(q[5].c6);
        r6_7.setText(q[5].c7);
        r6_8.setText(q[5].c8);

        return rootView;
    }

//    public String onRadioButtonClicked1(View view){
//        RadioGroup rg=(RadioGroup) view.findViewById(R.id.q1_1);
//        String radioValue=((RadioButton)view.findViewById(rg.getCheckedRadioButtonId())).getText().toString();
//        Toast toast=Toast.makeText(getActivity(), radioValue, Toast.LENGTH_SHORT);
//        toast.show();
//        return radioValue;
//    }
//    public String onRadioButtonClicked2(View view){
//        RadioGroup rg=(RadioGroup)view.findViewById(R.id.q1_2);
//        String radioValue=((RadioButton)view.findViewById(rg.getCheckedRadioButtonId())).getText().toString();
//        Toast toast=Toast.makeText(getActivity(), radioValue, Toast.LENGTH_SHORT);
//        toast.show();
//        return  radioValue;
//    }
//    public String onRadioButtonClicked3(View view){
//        RadioGroup rg=(RadioGroup)view.findViewById(R.id.q1_3);
//        String radioValue=((RadioButton)view.findViewById(rg.getCheckedRadioButtonId())).getText().toString();
//        Toast toast=Toast.makeText(getActivity(), radioValue, Toast.LENGTH_SHORT);
//        toast.show();
//        return radioValue;
//    }
//    public String onRadioButtonClicked4(View view){
//        RadioGroup rg=(RadioGroup)view.findViewById(R.id.q1_4);
//        String radioValue=((RadioButton)view.findViewById(rg.getCheckedRadioButtonId())).getText().toString();
//        Toast toast=Toast.makeText(getActivity(), radioValue, Toast.LENGTH_SHORT);
//        toast.show();
//        return radioValue;
//    }
//    public String onRadioButtonClicked5(View view){
//        RadioGroup rg=(RadioGroup)view.findViewById(R.id.q1_5);
//        String radioValue=((RadioButton)view.findViewById(rg.getCheckedRadioButtonId())).getText().toString();
//        Toast toast=Toast.makeText(getActivity(), radioValue, Toast.LENGTH_SHORT);
//        toast.show();
//        return radioValue;
//    }
//    public String onRadioButtonClicked6(View view){
//        RadioGroup rg=(RadioGroup)view.findViewById(R.id.q1_6);
//        String radioValue=((RadioButton)view.findViewById(rg.getCheckedRadioButtonId())).getText().toString();
//        Toast toast=Toast.makeText(getActivity(), radioValue, Toast.LENGTH_SHORT);
//        toast.show();
//        return  radioValue;
//    }
//    public String getEditTextValue(View view,int id){
//        EditText desc=(EditText)view.findViewById(id);
//        return desc.getText().toString();
//    }

//    public void save(View view){
//        dbhelper db=new dbhelper(getActivity());
//
//        String s[]=new String[6];
//        String desc5=getEditTextValue(view,R.id.q5_desc);
//        String desc6=getEditTextValue(view,R.id.q6_desc);
//        for (int i=0;i<6;i++){
//
//            switch (i){
//                case 0:
//                    s[i]=onRadioButtonClicked1(view);
//                    break;
//                case 1:
//                    s[i]=onRadioButtonClicked2(view);
//                    break;
//                case 2:
//                    s[i]=onRadioButtonClicked3(view);
//                    break;
//                case 3:
//                    s[i]=onRadioButtonClicked4(view);
//                    break;
//                case 4:
//                    s[i]=onRadioButtonClicked5(view);
//                    break;
//                case 5:
//                    s[i]=onRadioButtonClicked6(view);
//                    break;
//            }
//        }
//        for (int i=0;i<6;i++)
//        {
//            if (i==4 || i==5)
//            {
//                if (i==4){
//                    db.updateRow(s[i],desc5,i+1);
//                }
//                else{
//                    db.updateRow(s[i],desc6,i+1);
//                }
//            }
//            else{
//                db.updateRow(s[i]," ",i+1);
//            }
//
//        }
//
//    }


}
