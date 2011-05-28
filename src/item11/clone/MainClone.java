package item11.clone;

import java.util.Arrays;

/**
 * User: shivprb
 * Date: Oct 5, 2009
 * Time: 8:21:18 PM
 */
public class MainClone {

    static class Children implements Cloneable{
        private String child;

        public Children(String child) {
            this.child = child;
        }

        public void setChild(String child) {
            this.child = child;
        }

        @Override
        public String toString() {
            return child;
        }

        @Override
        public Children clone() {
            try {
                return (Children) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    static class Parent implements Cloneable{
        private  String name;
        private Children[] childs = new Children[5];
        private int noOfChildrens = 0;

        public Parent() {
            System.out.println("Constructor called....");
        }

        public Parent(String name) {
            System.out.println("Constructor called....");
            this.name = name;
        }

        public Children getChild(int index){
            return childs[index];
        }

        public void addChild(String child){
            childs[noOfChildrens++]=new Children(child);
        }

        @Override
        public Parent clone()  {
            Parent o = null;
            try {
                o = (Parent) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            o.childs=childs.clone();
            for (int i = 0; i < childs.length && childs[i]!=null; i++) {
                Children child = childs[i];
                o.childs[i]=child.clone();
            }
            System.out.println("Class Name "+o.getClass());
            return o;
        }

        public String getName() {
            return name;
        }

        public String getChilds() {
            return Arrays.toString(childs);
        }

        @Override
        public String toString() {
            return name + " has childrens named "+getChilds();
        }
    }


          public static void main(String[] args) {
              Parent parent = new Parent("Tom");
              parent.addChild("a");
              parent.addChild("b");
              parent.addChild("c");

              Parent anotherParent = parent.clone();

              System.out.println(parent);
              System.out.println(anotherParent);

              anotherParent.getChild(0).setChild("x");

              System.out.println(parent);
              System.out.println(anotherParent);
          }

}
