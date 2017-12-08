
const gulp = require('gulp');
const concat = require('gulp-concat');
const browserSync = require('browser-sync').create();

var devMode = false;

gulp.task('css', function() {
    gulp.src("./public/stylesheets/main.css")
        .pipe(concat('main.css'))
        .pipe(gulp.dest('build/front/myproject/css'))
        .pipe(browserSync.reload({
            stream: true
        }));
});
gulp.task('bootstrap', function() {
    gulp.src(["./public/stylesheets/bootstrap/bootstrap.css",])
        .pipe(concat('bootstrap.css'))
        .pipe(gulp.dest('build/front/myproject/css'))
        .pipe(browserSync.reload({
            stream: true
        }));
});
gulp.task('bootstrapTheme', function() {
    gulp.src("./public/stylesheets/bootstrap/bootstrap-theme.css")
        .pipe(concat('bootstrap-theme.css'))
        .pipe(gulp.dest('build/front/myproject/css'))
        .pipe(browserSync.reload({
            stream: true
        }));
});
gulp.task('material', function () {
    return gulp.src("./node_modules/angular-material/**/*")
        .pipe(gulp.dest('build/front/myproject/css/angular-material/'));
});


gulp.task('bootJava', function() {
    gulp.src("./public/javascript/bootstrap/bootstrap.js")
        .pipe(concat('bootstrap.js'))
        .pipe(gulp.dest('build/front/myproject/js'))
        .pipe(browserSync.reload({
            stream: true
        }));
});

gulp.task('angular', function() {
    gulp.src([
        "./node_modules/angular/angular.js",
        "./node_modules/angular-ui-router/release/angular-ui-router.js",
        "./node_modules/angular-animate/angular-animate.js",
        "./node_modules/angular-aria/angular-aria.js",
        "./node_modules/angular-material/angular-material.js",
        "./node_modules/angular-messages/angular-messages.js",
        "./node_modules/angular-sanitize/angular-sanitize.js",
    ])
        .pipe(concat('angular.js'))
        .pipe(gulp.dest('build/front/myproject/js'))
        .pipe(browserSync.reload({
            stream: true
        }));
});

gulp.task('app', function() {
    gulp.src("./public/javascript/app.js")
        .pipe(concat('app.js'))
        .pipe(gulp.dest('build/front/myproject/js'))
        .pipe(browserSync.reload({
            stream: true
        }));
});



gulp.task('html', function() {
    return gulp.src('./public/templates/**/*.html')
        .pipe(gulp.dest('build/front/myproject/'))
        .pipe(browserSync.reload({
            stream: true
        }));
});

gulp.task('fonts',function(){
    return gulp.src(['./public/fonts/**/*'])
        .pipe(gulp.dest('build/front/myproject/fonts/'));
})

gulp.task('css-lib',function(){
    return gulp.src(['./public/stylesheets/lib/**/*'])
        .pipe(gulp.dest('build/front/myproject/css/lib/'));
})

gulp.task('build', function() {
    gulp.start(['bootJava','angular','app','css',
        'material','css-lib','html','fonts','bootstrap','bootstrapTheme',]);
});

gulp.task('browser-sync', function() {
    browserSync.init(null, {
        open: false,
        server: {
            baseDir: 'build/front/myproject',
        }
    });
});

gulp.task('start', function() {
    devMode = true;
    gulp.start(['build', 'browser-sync']);
    gulp.watch(['./public/stylesheets/main.css'], ['css']);
    gulp.watch(['./public/javascript/app.js'], ['app']);
    gulp.watch(['./public/templates/views/*.html'], ['html']);
    gulp.watch(['./public/templates/*.html'], ['html']);

});
