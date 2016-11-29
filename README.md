# FPageIndicator
用来显示当前所在页的页面指示器，具体样式见Readme中的Gif文件。

具体实现方式，在这篇博客里面有详细地说明。[http://www.woaitqs.cc/android/2016/11/28/android-view-theory-5.html](http://www.woaitqs.cc/android/2016/11/28/android-view-theory-5.html)

![样式展示](https://cloud.githubusercontent.com/assets/1680722/20701135/42297c0a-b64c-11e6-8eea-ab706946af90.gif)

---------------
# 试用说明

提供的接口

|方法名   	|使用说明   	|
|:-:	|---	|
|setSelectedPos(int pos)   	|设置当前选中的位置.   	|
|setCount(int count)   	|设置 Page Indicator 总共的数目   	|
|attachToViewPager(ViewPager viewPager)   	|如果想和 ViewPager 绑定起来，直接调用这个接口即可.   	|

可自定义的地方

|属性名   	|解释   	|
|:-:	|---	|
|pi_count   	|总数目 	|
|pi_out_radius   	|外圈的大小 	|
|pi_radius   	|内圈的大小 	|
|pi_un_focus_color   	|未选中的颜色 	|
|pi_focus_color   	|选中时的颜色 	|
|pi_padding   	|两点之间的间距 	|

---------------

# Licence
FPageIndicator is licensed under the MIT license

In case of using the issue to the woaitqs@gmail.com please!
