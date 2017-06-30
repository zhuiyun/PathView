package com.jbstore.o2o.model1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by gwy on 2017/6/29.
 */

public class DiaView extends View {
    Paint paint;
    Paint mpPaint;
    private Path path = new Path();
    private Path path1 = new Path();
    private Path path2 = new Path();

    public DiaView(Context context) {
        this(context, null);
    }

    public DiaView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DiaView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initPaint();
    }

    private void initPaint() {
        paint = new Paint();
        mpPaint = new Paint();
        mpPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mpPaint.setColor(Color.BLUE);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(5);
        paint.setTextSize(50);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
     /*   canvas.drawRect(100, 100, 150, 150, paint);
        canvas.translate(400, 400);
        canvas.drawRect(100, 100, 150, 150, paint);*/
//        Path path = new Path();
//        path.cubicTo(0, 0, 300, 300, 500, 200);
//        canvas.drawPath(path, paint);
//        canvas.drawTextOnPath("gaowenyiunm", path, 50, 0, paint);
//        canvas.drawRoundRect(new RectF(100, 100, 700, 700), 30, 30, paint);
//        canvas.drawArc(new RectF(100,100,500,500),-90,180,true,paint);
//        path.moveTo(100, 100);

     /*   path.lineTo(150, 100);
        path.moveTo(300, 500);
        path.lineTo(200, 500);
        path.close();
        canvas.drawPath(path, paint);*/
      /*  path.lineTo(400, 500);

        // 将当前点移动到(300, 300)
        path.moveTo(300, 300) ;

        //连接点(900, 800)
        path.lineTo(900, 800);
        path.lineTo(200,700);
        // 闭合路径，即连接当前点和起点
        // 即连接(200,700)与起点2(300, 300)
        // 注:此时起点已经进行变换
        path.close();*/
     /*   canvas.drawPoint(300, 400, mpPaint);
        path.lineTo(500, 300);
        path.setLastPoint(300, 700);

        path.lineTo(200, 200);
        path.close();
        path.reset();
//        path.rewind();
        path.lineTo(500,500);
//        canvas.drawPath(path, paint);


        // 画出路径
        canvas.drawPath(path, paint);*/
       /* canvas.translate(200, 200);
        path.lineTo(0,100);
        path.lineTo(500,300);
        path.lineTo(-100,200);
        path.close();
//        path.addRect(new RectF(200, 200, 500, 500), Path.Direction.CCW);
        canvas.drawPath(path, paint);*/
     /*   canvas.translate(400, 500);
        path.lineTo(-100, 0);
        path.addCircle(0, 0, 100, Path.Direction.CW);
        path.lineTo(-100, 200);
        path.lineTo(200, 200);
        path.close();
        canvas.drawPath(path, paint);*/
      /*  canvas.translate(400, 500);
        path.lineTo(200, 300);
//        canvas.drawRect(200, 300, 400, 500, paint);
//        path.addArc(new RectF(200, 300, 400, 500), -90, 90);
        path.arcTo(new RectF(200, 300, 400, 500), -90, 180);
        canvas.drawPath(path, paint);*/
       /* canvas.translate(400, 500);
        path.lineTo(100, 200);
        path.lineTo(300, 100);
        path.lineTo(100,0);
        path.close();
        canvas.drawPath(path, paint);
        RectF rectF = new RectF();*/
     /*  canvas.translate(200,200);
        path.lineTo(0, 400);
        path.lineTo(400, 400);
        path.lineTo(400, 0);
        path.lineTo(0, 0);
        canvas.drawPath(path,paint);

        RectF rect = new RectF();*/
       /* path.addRect(new RectF(300, 300, 500, 500), Path.Direction.CCW);
//
        path1.addCircle(0, 0, 150, Path.Direction.CW);
//        canvas.drawPath(path1, paint);
        path.addPath(path1, 300, 300);
        canvas.drawPath(path, paint);*/
        /*canvas.drawText(path.isRect(rect) + "", 0, 0, paint);*/
     /*   canvas.translate(400, 500);
        path.addCircle(0, 0, 200, Path.Direction.CCW);
        path1.addRect(100, 200, 300, 400, Path.Direction.CW);
        path.set(path1);
        path.offset(300,500,path2);

        canvas.drawPath(path, paint);
        paint.setColor(Color.DKGRAY);
        canvas.drawPath(path2,paint);*/
       /* canvas.translate(400, 500);
//        path.addCircle(0, 0, 200, Path.Direction.CW);
        path.addRect(-200, -200, 200, 200, Path.Direction.CW);
        path.setFillType(Path.FillType.EVEN_ODD);
        canvas.drawPath(path, mpPaint);*/
      /*  canvas.translate(550, 550);
        // 在路径中添加大正方形
        // 逆时针
        path.addRect(-400, -400, 400, 400, Path.Direction.CCW);

        // 在路径中添加小正方形
        // 顺时针
//        path.addRect(-200, -200, 200, 200, Path.Direction.CW);
//          设置为逆时针
        path.addRect(-200, -200, 200, 200, Path.Direction.CCW);


        // 设置Path填充模式为非零环绕规则
        path.setFillType(Path.FillType.INVERSE_WINDING);
        // 设置反非零环绕数规则
        // path.setFillType(Path.FillType.INVERSE_WINDING);

        // 绘制Path
        canvas.drawPath(path, mpPaint);*/
       /* canvas.translate(350, 500);

        // 在Path中添加一个矩形
        path.addRect(-200, -200, 200, 200, Path.Direction.CCW);

        // 设置Path填充模式为 奇偶规则
//        path.setFillType(Path.FillType.EVEN_ODD);

        // 反奇偶规则
         path.setFillType(Path.FillType.INVERSE_EVEN_ODD);

        // 画出路径
        canvas.drawPath(path, mpPaint);
*/
        // 为了方便观察,平移坐标系
      /*  canvas.translate(550, 550);
        // 在路径中添加大正方形
        // 逆时针
//        path.addRect(-400, -400, 400, 400, Path.Direction.CCW);
        path.addCircle(0,0,200, Path.Direction.CCW);
        // 在路径中添加小正方形
        // 顺时针
//        path.addRect(-200, -200, 200, 200, Path.Direction.CW);
//          设置为逆时针
//        path.addRect(-200, -200, 200, 200, Path.Direction.CCW);


        // 设置Path填充模式为非零环绕规则
        path.setFillType(Path.FillType.WINDING);*/

        // 设置反非零环绕数规则
        // path.setFillType(Path.FillType.INVERSE_WINDING);

        // 绘制Path
//        canvas.drawPath(path, mpPaint);
//        path.lineTo();
        canvas.translate(400, 500);
       /* path.addCircle(0, 0, 300, Path.Direction.CW);
        path1.addCircle(0, 200, 300, Path.Direction.CW);
        path.op(path1, Path.Op.DIFFERENCE);
        canvas.drawPath(path, paint);
        canvas.drawPath(path1, paint);*/
        path.rQuadTo(200,300,100,500);
        canvas.drawPath(path,paint);

/*      Path path = new Path();

        // 2. 设置路径轨迹
        path.cubicTo(540, 750, 640, 450, 840, 600);
        // 3. 画路径
        canvas.drawPath(path, paint);
        // 4. 画出在路径上的字
        canvas.drawTextOnPath("在Path上写的字:Carson_Ho", path, 50, 0, paint);*/
      /*  path.lineTo(400, 500);

        // 将当前点移动到(300, 300)
        path.moveTo(300, 300) ;

        //连接点(900, 800)
        path.lineTo(900, 800);

        // 闭合路径，即连接当前点和起点
        // 即连接(200,700)与起点2(300, 300)
        // 注:此时起点已经进行变换
        path.close();

        // 画出路径
        canvas.drawPath(path,paint);
        path.cubicTo(100,100,300,200,500,300);
        canvas.drawPath(path,paint);*/

    }
}
