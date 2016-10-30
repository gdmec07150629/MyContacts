package cn.edu.gdmec.s07150629.mycontacts;

import android.content.ContentValues;
import android.content.Context;

/**
 * Created by Administration on 2016/10/23.
 */
public class ContactsTable {
    private final static String TABLENAME="contactTable";
    private MyDB db;
    public ContactsTable(Context context){
        db=new MyDB(context);
        if (!db.isTableExits(TABLENAME)){
            String createTableSql="CREATE TABLE IF NOT EXISTS"+
                    TABLENAME+"id_DB integer"+
                    "primary key AUTOINCREMENT,"+
                    User.NAME+"VARCHAR,"+
                    User.MOBILE+"VARCHAR,"+
                    User.QQ+"VARCHAR,"+
                    User.DANWEI+"VARCHAR,"+
                    User.ADDRESS+"VARCHAR)";
            db.createTable(createTableSql);
        }
    }
    public boolean addData(User user){
        ContentValues values=new ContentValues();
        values.put(User.NAME,user.getName());
        values.put(User.MOBILE,user.getMobile());
        values.put(User.QQ,user.getQq());
        values.put(User.DANWEI,user.getDanwei());
        values.put(User.ADDRESS,user.getAddress());
        return db.save(TABLENAME,values);
    }
}
