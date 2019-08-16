package com.pingan;

public class IdeaTest {

    public static void main(String[] args) {
        /**
         * 1.设置字体
         * File->settings(ctrl+Alt+s)->editor->font->size
         *
         * 2.快捷键(复用eclipse的快捷键)
         * File->settings(ctrl+Alt+s)->keymap->eclipse
         *
         * 3.快捷键设置
         * File->settings(ctrl+Alt+s)->keymap->按功能搜索/按快捷键搜索
         * ->右键->增加一个快捷键（add keyboard shortcut）/移除一个快捷键（remove *）
         *
         * 4.设置模板
         *      a.Postfix Completion:系统模板，不可修改  File->settings(ctrl+Alt+s)->editor->general->Live Templates
         *      b.Live Templates:自定义模板    File->settings(ctrl+Alt+s)->editor->Live Templates
         *          1)修改模板：如main方法，在eclipse是main，在idea是psvm(private static void main的首字母)
         *              File->settings(ctrl+Alt+s)->editor->Live Templates->other->psvm
         *          2)新增模板：如public static final int
         *              File->settings(ctrl+Alt+s)->editor->Live Templates->点击加号
         *              ->add Live Templates->difine->java
         *
         * 5.版本控制（准备条件：安装git,注册github）
         *     a、设置github的账号密码：File->settings(ctrl+Alt+s)->version control->github->输入账号密码->test
         *     b、设置git的本地启动：File->settings(ctrl+Alt+s)->version control->git->path to git executable->C:\Program Files\Git\bin\git.exe
         *     c、设置git的账号密码：git config --global user.name "youname"
         *                          git config --global user.email "aa@qq.com"
         *                 这时候在C:\\User\\用户名\\下有一个名字叫.gitconfig文件，可以打开看到里面的内容
         *     d、拉取github的项目：VCS->checkout from version control->git
         *     e、推送项目到github:VCS->import into version control->share project on github
         *          (此时可能只上传了一个空项目，代码src文件夹的代码都没有推送到远程)
         * 6.集成maven
         */
        System.out.println("test");
        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
        }
    }
    private static final int a = 2;





}
