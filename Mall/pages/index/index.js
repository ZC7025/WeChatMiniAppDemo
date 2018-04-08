//index.js
//获取应用实例
const app = getApp()

Page({
  data: {
    imgUrls: [
      'http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg',
      'http://img06.tooopen.com/images/20160818/tooopen_sy_175866434296.jpg',
      'http://img06.tooopen.com/images/20160818/tooopen_sy_175833047715.jpg'
    ],
    // 显示圆点
    indicatorDots: true,
    //自动换图
    autoplay: true,
    //换图时间
    interval: 5000,
    //过渡时间
    duration: 1000,
    products: []
    //事件处理函数
  },
  bindViewTap: function () {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  onLoad: function () {
    let self = this;
    wx.request({
      url: 'http://localhost:8080/product/all', //仅为示例，并非真实的接口地址
      method: 'get',
      header: {
        'content-type': 'application/json' // 默认值
      },
      success: function (res) {
        console.log(res.data)
        self.setData({
          products: res.data
        })
      }
    })
  },
  showDetail:function(e) {
    wx.navigateTo({
      url: '../detail/detail?id=' + e.target.dataset.id
    })
  }
})
