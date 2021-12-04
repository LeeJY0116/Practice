from ezgraphics import GraphicsWindow

win = GraphicsWindow(300, 300)
canvas = win.canvas()

xLeft = 100
yTop = 100
width = 90

canvas.setColor("green")
canvas.drawRect(xLeft, yTop, width / 3, width * 2 / 3)

canvas.setColor("red")
canvas.drawRect(xLeft + 2 * width / 3, yTop, width / 3, width * 2 / 3)

canvas.setColor("black")
canvas.drawLine(xLeft + width / 3, yTop, xLeft + width * 2 / 3, yTop)
canvas.drawLine(xLeft + width / 3, yTop + width * 2 / 3,
                xLeft + width * 2 / 3, yTop + width * 2 / 3)

win.wait()