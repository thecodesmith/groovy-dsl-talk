## SwingBuilder

```
count = 0
new SwingBuilder().edt {
    frame(title: 'Counter', size: [300, 300], show: true) {
        borderLayout()

        textlabel = label(text: 'Click the button!', constraints: BL.NORTH)

        button(
                text: 'Click Me',   
                constraints: BL.SOUTH,
                actionPerformed: { 
                    count++
                    textlabel.text = "Clicked ${count} time(s)." 
                }
        )
    }
}
```
