package com.example.android.newsurvey;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by amandhapola on 03/07/15.
 */
public class dbhelper extends SQLiteOpenHelper {

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    public contract.questions q=new contract().new questions();
    public static final int DATABASE_VERSION = 9;
    public static final String DATABASE_NAME = "survey.db";
    private final String SQL_CREATE_ENTRIES="create table "+q.TABLE_NAME+" ( "+q._ID+" integer primary key, "
            +q.COLUMN_QUESTION+" TEXT NOT NULL UNIQUE "+COMMA_SEP+q.COLUMN_CHOICE1+TEXT_TYPE+COMMA_SEP+q.COLUMN_CHOICE2+TEXT_TYPE+COMMA_SEP
            +q.COLUMN_CHOICE3+TEXT_TYPE+COMMA_SEP+q.COLUMN_CHOICE4+TEXT_TYPE+COMMA_SEP+q.COLUMN_CHOICE5+TEXT_TYPE+COMMA_SEP
            +q.COLUMN_CHOICE6+TEXT_TYPE+COMMA_SEP+q.COLUMN_CHOICE7+TEXT_TYPE+COMMA_SEP+q.COLUMN_CHOICE8+TEXT_TYPE+COMMA_SEP
            +q.COLUMN_CHOICE9+TEXT_TYPE+COMMA_SEP+q.COLUMN_CHOICE10+TEXT_TYPE+COMMA_SEP+q.COLUMN_CHOICE11+TEXT_TYPE+COMMA_SEP
            +q.COLUMN_DESC+TEXT_TYPE+COMMA_SEP+q.ANSWER+TEXT_TYPE +" )";

    private  final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + q.TABLE_NAME;
    private static String TAG = "DataBaseHelper";
    private static String DB_PATH = "/data/data/com.example.android.newsurvey/databases/";
    private static String DB_NAME ="survey.db";
//    private final Context myContext;
    private SQLiteDatabase myDataBase; ;
    public dbhelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//        this.myContext = context;
//        if(android.os.Build.VERSION.SDK_INT >= 17){
//            DB_PATH = context.getApplicationInfo().dataDir + "/databases/";
//        }
//        else
//        {
//            DB_PATH = "/data/data/" + context.getPackageName() + "/databases/";
//        }
//        this.mContext = context;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
//    public void createDataBase() throws IOException {
//
//        boolean dbExist = checkDataBase();
//
//        if(dbExist){
//            //do nothing - database already exist
//        }else{
//
//            //By calling this method and empty database will be created into the default system path
//            //of your application so we are gonna be able to overwrite that database with our database.
//            this.getReadableDatabase();
//
//            try {
//
//                copyDataBase();
//
//            } catch (IOException e) {
//
//                throw new Error("Error copying database");
//
//            }
//        }
//
//    }
//
//    /**
//     * Check if the database already exist to avoid re-copying the file each time you open the application.
//     * @return true if it exists, false if it doesn't
//     */
//    private boolean checkDataBase(){
//
//        SQLiteDatabase checkDB = null;
//
//        try{
//            String myPath = DB_PATH + DB_NAME;
//            checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
//
//        }catch(SQLiteException e){
//
//            //database does't exist yet.
//
//        }
//
//        if(checkDB != null){
//
//            checkDB.close();
//
//        }
//
//        return checkDB != null ? true : false;
//    }
//
//    /**
//     * Copies your database from your local assets-folder to the just created empty database in the
//     * system folder, from where it can be accessed and handled.
//     * This is done by transfering bytestream.
//     * */
//    private void copyDataBase() throws IOException{
//
//        //Open your local db as the input stream
//        InputStream myInput = myContext.getAssets().open(DB_NAME);
//
//        // Path to the just created empty db
//        String outFileName = DB_PATH + DB_NAME;
//
//        //Open the empty db as the output stream
//        OutputStream myOutput = new FileOutputStream(outFileName);
//
//        //transfer bytes from the inputfile to the outputfile
//        byte[] buffer = new byte[1024];
//        int length;
//        while ((length = myInput.read(buffer))>0){
//            myOutput.write(buffer, 0, length);
//        }
//
//        //Close the streams
//        myOutput.flush();
//        myOutput.close();
//        myInput.close();
//
//    }
//
//    public void openDataBase() throws SQLException {
//
//        //Open the database
//        String myPath = DB_PATH + DB_NAME;
//        myDataBase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
//
//    }
//
//    @Override
//    public synchronized void close() {
//
//        if(myDataBase != null)
//            myDataBase.close();
//
//        super.close();
//
//    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////
//    public void createDataBase() throws IOException
//    {
//        //If database not exists copy it from the assets
//
//        boolean mDataBaseExist = checkDataBase();
//        if(!mDataBaseExist)
//        {
//            this.getReadableDatabase();
//            this.close();
//            try
//            {
//                //Copy the database from assests
//                copyDataBase();
//                Log.e(TAG, "createDatabase database created");
//            }
//            catch (IOException mIOException)
//            {
//                throw new Error("ErrorCopyingDataBase");
//            }
//        }
//    }
//    //Check that the database exists here: /data/data/your package/databases/Da Name
//    private boolean checkDataBase()
//    {
//        File dbFile = new File(DB_PATH + DB_NAME);
//        //Log.v("dbFile", dbFile + "   "+ dbFile.exists());
//        return dbFile.exists();
//    }
//
//    //Copy the database from assets
//    private void copyDataBase() throws IOException
//    {
//        InputStream mInput = mContext.getAssets().open(DB_NAME);
//        String outFileName = DB_PATH + DB_NAME;
//        OutputStream mOutput = new FileOutputStream(outFileName);
//        byte[] mBuffer = new byte[1024];
//        int mLength;
//        while ((mLength = mInput.read(mBuffer))>0)
//        {
//            mOutput.write(mBuffer, 0, mLength);
//        }
//        mOutput.flush();
//        mOutput.close();
//        mInput.close();
//    }
//
//    //Open the database, so we can query it
//    public boolean openDataBase()
//    {
//        String mPath = DB_PATH + DB_NAME;
//        //Log.v("mPath", mPath);
//        mDataBase = SQLiteDatabase.openDatabase(mPath, null, SQLiteDatabase.CREATE_IF_NECESSARY);
//        //mDataBase = SQLiteDatabase.openDatabase(mPath, null, SQLiteDatabase.NO_LOCALIZED_COLLATORS);
//        return mDataBase != null;
//    }
//
//    @Override
//    public synchronized void close()
//    {
//        if(mDataBase != null)
//            mDataBase.close();
//        super.close();
//    }
//

    @Override
    public void onCreate(SQLiteDatabase db) {
        System.out.println("inside on create of db");
        db.execSQL(SQL_CREATE_ENTRIES);
        contract.questions q1=populate_questions_object("Please identify which of the following options best identifies you currently",
                "Student","working in private sector","Working in the government or public sector","Working in a non profit (NGO)"
                ,"Working as an entrepreneur (business-person)","Looking for employment ","Other","  ","  ","  ","  ","  ","  ");

        contract.questions q2=populate_questions_object("If you have studied beyond Class 12 then what area did you study in?",
                "Engineering","Medicine","Basic Science","Commerce/Management","law","Arts/ Humanities","Did not complete Class XII",
                "  ","  ","  ","  ","  ","  ");
        contract.questions q3=populate_questions_object("Which one of these opportunities are you most likely to pursue within the next three years?",
                "Running my own organization as an entrepreneur (includes as part of startup team) (own business)",
                "Private sector employment in an established company",
                "Employment in a government agency",
                "Employment in the not-for-profit sector (NGO)",
                "Pursuing further education"," "," ",
                "  ","  ","  ","  ","  ","  ");

        contract.questions q4=populate_questions_object("If your response to above is not ‘Running my own organization as an entrepreneur,’ what is the main reason for not choosing this option.",
                "Limited knowledge of what entrepreneurship requires",
                "Lack of a new or innovative idea for entrepreneurship",
                "Inability to access specialized knowledge needed",
                "Inability to access funds to start business (risk capital)",
                "Non availability of (incubation mechanism)(institution/government based support system) for start-ups",
                "Inability / unwillingness to take the financial risk",
                "Family pressure to seek stable employment",
                "No tradition of entrepreneurship in my community/Caste discrimination",
                "Your belief that there are too many legal, regulatory and other barriers to succeed as an entrepreneur",
                "Gender discrimination-Patriarchal mindsets, social-cultural norms/\tPerspective of people towards women etc.",
                "Not Applicable","  ","  ");

        contract.questions q5=populate_questions_object("If your response to above is 'Running my own organization as an entrepreneur’, which of the following have been most helpful in steering you in this direction",
                "College experiences (course of study or other services provided by the college)",
                "Family and / or friends",
                "Government programs",
                "Networking groups (such as TiE, Nasscom, or sector specific groups)",
                "Individual examples you wish to emulate",
                "Incubators or accelerators (institution/government based support system) designed to help startup activity",
                "Other (Please elaborate briefly)",
                "Not Applicable","  ","  ","  ","  ","  ");

        contract.questions q6=populate_questions_object("Which of these factors most needs to be addressed to allow there to be more entrepreneurship in India? (There can be more than one option selected)",
                "Reduction of red tape and bureaucratic procedures",
                "Reduction of generalized corruption",
                "Access to funds to start business (risk capital)",
                "Access to specialized knowledge in particular industry sectors",
                "Quick and easy access of incubation facility",
                "Familiarity with past examples of success and/or failure",
                "Adoption of entrepreneurship curriculum in schools and collages",
                "Other (Please elaborate briefly)","  ","  ","  ","  ","  ");
        this.add_ques(q1,db);
        this.add_ques(q2,db);
        this.add_ques(q3,db);
        this.add_ques(q4,db);
        this.add_ques(q5,db);
        this.add_ques(q6,db);
        System.out.println("done inserting");
        Log.v("db", "created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        System.out.println("inside on upgrade of db");
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    void add_ques(contract.questions ques,SQLiteDatabase db){
//       SQLiteDatabase db=this.getWritableDatabase();
       ContentValues values=new ContentValues();
       values.put(ques.COLUMN_QUESTION,ques.getQuestion());
        values.put(ques.ANSWER,ques.getAnswer());
        values.put(ques.COLUMN_CHOICE1,ques.getC1());
        values.put(ques.COLUMN_CHOICE2,ques.getC2());
        values.put(ques.COLUMN_CHOICE3,ques.getC3());
        values.put(ques.COLUMN_CHOICE4,ques.getC4());
        values.put(ques.COLUMN_CHOICE5,ques.getC5());
        values.put(ques.COLUMN_CHOICE6,ques.getC6());
        values.put(ques.COLUMN_CHOICE7,ques.getC7());
        values.put(ques.COLUMN_CHOICE8,ques.getC8());
        values.put(ques.COLUMN_CHOICE9,ques.getC9());
        values.put(ques.COLUMN_CHOICE10,ques.getC10());
        values.put(ques.COLUMN_CHOICE11,ques.getC11());
        values.put(ques.COLUMN_DESC,ques.getDesc());
        db.insert(q.TABLE_NAME, null, values);
//        db.close();
    }
    String get_row(int id){
        SQLiteDatabase db=this.getReadableDatabase();
        String projection[]={
                q.COLUMN_QUESTION
        };
        Cursor c=db.query(q.TABLE_NAME,projection,q._ID+"=?",new String[]{String.valueOf(id)},null,null,null);
        if (c!=null){
            c.moveToFirst();
        }
        else{
            Log.v("db","cannot find row");
        }
        return c.getString(0);
    }

    ///////////////////////////////
    contract.questions populate_questions_object(String ques,String c1,String c2,String c3,String c4,String c5,String c6,String c7,String c8,
                                                 String c9,String c10,String c11,String desc,String ans)
    {
        contract.questions q=new contract().new questions(ques,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,desc,ans);
        return q;
    }

    ////////////////////////////////////

    contract.questions get_row_object(int id){
        SQLiteDatabase db=this.getReadableDatabase();
        String projection[]={
                q.COLUMN_QUESTION,
                q.COLUMN_CHOICE1,
                q.COLUMN_CHOICE2,
                q.COLUMN_CHOICE3,
                q.COLUMN_CHOICE4,
                q.COLUMN_CHOICE5,
                q.COLUMN_CHOICE6,
                q.COLUMN_CHOICE7,
                q.COLUMN_CHOICE8,
                q.COLUMN_CHOICE9,
                q.COLUMN_CHOICE10,
                q.COLUMN_CHOICE11,
                q.COLUMN_DESC,

        };
        Cursor c=db.query(q.TABLE_NAME,projection,q._ID+"=?",new String[]{String.valueOf(id)},null,null,null);
        if (c==null){System.out.println("cursor is null");}
        if (c!=null && c.moveToFirst()){
            System.out.println("inside get row object");
//            c.moveToFirst();
            contract.questions q=new contract().new questions(c.getString(0),c.getString(1),c.getString(2),c.getString(3),c.getString(4),c.getString(5),
                    c.getString(6),c.getString(7),c.getString(8),c.getString(9),c.getString(10),c.getString(11),c.getString(12)," ");
            System.out.println("done with row function");
            return q;
        }
        else{
            Log.v("db","cannot find row");
        }
//        contract.questions q=new contract().new questions(c.getString(0),c.getString(1),c.getString(2),c.getString(3),c.getString(4),c.getString(5),
//                c.getString(6),c.getString(7),c.getString(8),c.getString(9),c.getString(10),c.getString(11),c.getString(12)," ");
//        System.out.println("done with row function");
//        return q;
        return null;
    }
    int getCount(){
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor c=db.rawQuery("select count(*) from questions;", null);
        int count=0;
        if (c!=null && c.moveToFirst()) {
            count = c.getInt(0);
            c.close();
        }
        return count;
    }

    void updateRow(String ans,String desc,int id){
        SQLiteDatabase db=this.getReadableDatabase();
        ContentValues values=new ContentValues();
        values.put(q.ANSWER, ans);
        values.put(q.COLUMN_DESC, desc);
        String selection=q._ID + " LIKE ?";
        String[] selectionArgs = { String.valueOf(id) };
        db.update(q.TABLE_NAME,values,selection,selectionArgs);
    }
}
