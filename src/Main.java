//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
 Benotungen benotungen = new Benotungen();
 int[] noten = {12,37,56, 38,45, 48, 23,78,65,78,89} ;
 System.out.println(Arrays.toString(benotungen.durchgefallen(noten)));
 System.out.println(benotungen.mittelwertnote(noten));
 System.out.println(Arrays.toString(benotungen.abgerundetenoten(noten)));
}
