package com.briup.apps.poll.bean;


/**
 * 题目类型
 * 单选，多选，简答
 * */
public enum QuestionType {
	 Selection("selection","单选题", 1),
	 Check("check","多选题", 2), 
	 Content("content","简答题", 3);
    // 成员变量  
    private String name;  
    private String nameZH;
    private int index;  
    // 构造方法  
    private QuestionType(String name,String nameZH, int index) {  
        this.name = name;  
        this.index = index;
        this.nameZH = nameZH;
    }  
    // 普通方法  
    public static String getName(int index) {  
        for (QuestionType c : QuestionType.values()) {  
            if (c.getIndex() == index) {  
                return c.name;  
            }  
        }  
        return null;  
    }  
    // get set 方法  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public int getIndex() {  
        return index;  
    }  
    public void setIndex(int index) {  
        this.index = index;  
    }
	public String getNameZH() {
		return nameZH;
	}
	public void setNameZH(String nameZH) {
		this.nameZH = nameZH;
	}  
}
