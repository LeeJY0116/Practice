from ezgraphics import GraphicsWindow

win = GraphicsWindow(300, 300)
canvas = win.canvas()

xLeft = 100
yTop = 100
width = 90

canvas.setColor("yellow")
canvas.drawRect(xLeft, yTop + 2 * width / 5, width, width / 4)

canvas.setColor("red")
canvas.drawRect(xLeft, yTop + 1 * width / 5, width, width / 4)

canvas.setColor("black")
canvas.drawRect(xLeft, yTop, width, width / 4)


win.wait()