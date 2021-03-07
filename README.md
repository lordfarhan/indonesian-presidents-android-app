# Indonesian Presidents Android App
A sample application build for finishing Dicoding course Belajar Android untuk Pemula submission.

## Plugins

Instructions on how to use them in your own application are linked below.

| Dependencies | Url |
| ------ | ------ |
| Kenburns View | [https://github.com/flavioarfaria/KenBurnsView][PlDb] |
| Bumptech | [https://github.com/bumptech/glide][PlGh] |

## Additional codes

1. Item layout
```xml
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:id="@+id/constraintLayout_containerMovieItem"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <androidx.cardview.widget.CardView
            android:id="@+id/cardView_cardMovieItem"
            android:layout_width="match_parent"
            android:layout_height="120dp"
            android:layout_marginStart="@dimen/default_space"
            android:layout_marginTop="@dimen/medium_space"
            android:layout_marginEnd="@dimen/default_space"
            android:layout_marginBottom="@dimen/medium_space"
            app:cardCornerRadius="@dimen/default_space"
            app:cardElevation="@dimen/default_card_elevation"
            app:layout_constraintBottom_toBottomOf="parent">

            <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent">

                <TextView
                    android:id="@+id/textView_titleMovieItem"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_marginStart="106dp"
                    android:layout_marginEnd="@dimen/medium_space"
                    android:ellipsize="end"
                    android:maxLines="2"
                    android:text="@{movie.title}"
                    android:textSize="@dimen/large_text_size"
                    android:textStyle="bold"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toTopOf="parent"
                    tools:text="@string/movie_title" />

                <ImageView
                    android:id="@+id/imageView_ratingIconMovieItem"
                    android:layout_width="24dp"
                    android:layout_height="24dp"
                    android:contentDescription="@string/movie_rating"
                    android:padding="@dimen/tiny_space"
                    android:src="@drawable/ic_baseline_star_24"
                    app:layout_constraintStart_toStartOf="@id/textView_titleMovieItem"
                    app:layout_constraintTop_toBottomOf="@id/textView_titleMovieItem"
                    app:tint="@color/colorSunFlower" />

                <TextView
                    android:id="@+id/textView_ratingMovieItem"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="@{String.format(@string/movie_rating_format, movie.voteAverage, movie.voteCount )}"
                    android:textSize="@dimen/default_text_size"
                    app:layout_constraintBottom_toBottomOf="@id/imageView_ratingIconMovieItem"
                    app:layout_constraintStart_toEndOf="@id/imageView_ratingIconMovieItem"
                    app:layout_constraintTop_toTopOf="@id/imageView_ratingIconMovieItem"
                    tools:text="6.4" />

                <TextView
                    android:id="@+id/textView_releaseDateMovieItem"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="@{movie.getYear()}"
                    android:textSize="@dimen/default_text_size"
                    app:layout_constraintStart_toStartOf="@id/textView_titleMovieItem"
                    app:layout_constraintTop_toBottomOf="@id/imageView_ratingIconMovieItem"
                    tools:text="2020" />

            </androidx.constraintlayout.widget.ConstraintLayout>

        </androidx.cardview.widget.CardView>

        <androidx.cardview.widget.CardView
            android:id="@+id/cardView_coverMovieItem"
            android:layout_width="90dp"
            android:layout_height="135dp"
            android:layout_marginStart="@dimen/medium_space"
            android:layout_marginTop="@dimen/medium_space"
            android:layout_marginBottom="@dimen/medium_space"
            app:cardCornerRadius="@dimen/default_space"
            app:cardElevation="@dimen/medium_space"
            app:layout_constraintBottom_toBottomOf="@id/cardView_cardMovieItem"
            app:layout_constraintStart_toStartOf="@id/cardView_cardMovieItem"
            app:layout_constraintTop_toTopOf="parent">

            <ImageView
                android:id="@+id/imageView_coverMovieItem"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:contentDescription="@string/movie_cover"
                android:scaleType="centerCrop"
                android:src="@color/design_default_color_primary" />

        </androidx.cardview.widget.CardView>

    </androidx.constraintlayout.widget.ConstraintLayout>
```

2. Detail layout
```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <com.google.android.material.appbar.AppBarLayout
            android:id="@+id/appBarLayout_detail"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@android:color/transparent"
            android:fitsSystemWindows="true"
            app:elevation="@dimen/no_space">

            <com.google.android.material.appbar.CollapsingToolbarLayout
                android:id="@+id/collapsingToolbarLayout_detail"
                android:layout_width="match_parent"
                android:layout_height="266dp"
                android:fitsSystemWindows="true"
                app:contentScrim="@android:color/transparent"
                app:layout_scrollFlags="scroll|exitUntilCollapsed">

                <androidx.constraintlayout.widget.ConstraintLayout
                    android:layout_width="match_parent"
                    android:layout_height="match_parent">

                    <com.flaviofaria.kenburnsview.KenBurnsView
                        android:id="@+id/imageView_backCoverDetail"
                        android:layout_width="match_parent"
                        android:layout_height="160dp"
                        android:alpha="0.6"
                        android:contentDescription="@string/movie_cover"
                        android:scaleType="centerCrop"
                        android:src="@color/colorPeterRiver"
                        app:layout_constraintEnd_toEndOf="parent"
                        app:layout_constraintStart_toStartOf="parent"
                        app:layout_constraintTop_toTopOf="parent" />

                    <androidx.cardview.widget.CardView
                        android:id="@+id/cardView_coverDetail"
                        android:layout_width="120dp"
                        android:layout_height="180dp"
                        android:layout_gravity="bottom"
                        android:layout_margin="@dimen/default_space"
                        app:cardCornerRadius="@dimen/default_space"
                        app:cardElevation="@dimen/no_space"
                        app:layout_constraintBottom_toBottomOf="parent"
                        app:layout_constraintStart_toStartOf="parent">

                        <ImageView
                            android:id="@+id/imageView_coverDetail"
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            android:contentDescription="@string/movie_cover"
                            android:scaleType="centerCrop"
                            android:src="@color/colorPeterRiver" />

                    </androidx.cardview.widget.CardView>

                    <TextView
                        android:id="@+id/textView_titleDetail"
                        style="@style/TextAppearance.MaterialComponents.Headline5"
                        android:layout_width="0dp"
                        android:layout_height="wrap_content"
                        android:layout_marginStart="@dimen/default_space"
                        android:layout_marginEnd="@dimen/default_space"
                        android:ellipsize="end"
                        android:maxLines="3"
                        android:text="@{movie.title}"
                        android:textStyle="bold"
                        app:layout_constraintBottom_toTopOf="@id/view_guideLineDetail"
                        app:layout_constraintEnd_toEndOf="parent"
                        app:layout_constraintStart_toEndOf="@id/cardView_coverDetail"
                        tools:text="Judulnya Disini: Coba Dua Baris Ah" />

                    <View
                        android:id="@+id/view_guideLineDetail"
                        android:layout_width="match_parent"
                        android:layout_height="1dp"
                        android:background="@android:color/transparent"
                        app:layout_constraintTop_toBottomOf="@id/imageView_backCoverDetail" />

                    <TextView
                        android:id="@+id/textView_taglineDetail"
                        android:layout_width="@dimen/no_space"
                        android:layout_height="wrap_content"
                        android:layout_marginEnd="@dimen/default_space"
                        android:ellipsize="end"
                        android:maxLines="2"
                        android:text="@{movie.tagline}"
                        android:textSize="@dimen/default_text_size"
                        android:textStyle="italic"
                        app:layout_constraintEnd_toEndOf="parent"
                        app:layout_constraintStart_toStartOf="@id/textView_titleDetail"
                        app:layout_constraintTop_toBottomOf="@id/view_guideLineDetail"
                        tools:text="Tagline bro" />

                    <ImageView
                        android:id="@+id/imageView_ratingIconDetail"
                        android:layout_width="22dp"
                        android:layout_height="22dp"
                        android:layout_marginTop="@dimen/small_space"
                        android:background="@drawable/shape_cricle"
                        android:backgroundTint="@color/colorSunFlower"
                        android:contentDescription="@string/movie_rating"
                        android:padding="@dimen/tiny_space"
                        android:src="@drawable/ic_baseline_star_24"
                        app:layout_constraintStart_toStartOf="@id/textView_taglineDetail"
                        app:layout_constraintTop_toBottomOf="@id/textView_taglineDetail"
                        app:tint="@color/design_default_color_on_primary" />

                    <TextView
                        android:id="@+id/textView_ratingDetail"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_marginStart="@dimen/small_space"
                        android:text="@{String.format(@string/movie_rating_format, movie.voteAverage, movie.voteCount )}"
                        android:textSize="@dimen/default_text_size"
                        app:layout_constraintBottom_toBottomOf="@id/imageView_ratingIconDetail"
                        app:layout_constraintStart_toEndOf="@id/imageView_ratingIconDetail"
                        app:layout_constraintTop_toTopOf="@id/imageView_ratingIconDetail"
                        tools:text="6.4" />

                </androidx.constraintlayout.widget.ConstraintLayout>

                <androidx.appcompat.widget.Toolbar
                    android:layout_width="match_parent"
                    android:layout_height="?attr/actionBarSize"
                    app:layout_collapseMode="pin"
                    app:layout_scrollFlags="scroll|enterAlways">

                    <FrameLayout
                        android:id="@+id/frameLayout_actionBar"
                        android:layout_width="match_parent"
                        android:layout_height="?attr/actionBarSize"
                        app:layout_constraintTop_toTopOf="parent">

                        <ImageView
                            android:id="@+id/imageView_actionBack"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_gravity="center_vertical"
                            android:contentDescription="@string/action_back"
                            android:src="@drawable/ic_baseline_keyboard_arrow_left_24"
                            app:tint="@color/design_default_color_on_primary" />

                    </FrameLayout>

                </androidx.appcompat.widget.Toolbar>

            </com.google.android.material.appbar.CollapsingToolbarLayout>

        </com.google.android.material.appbar.AppBarLayout>

        <androidx.core.widget.NestedScrollView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:layout_behavior="@string/appbar_scrolling_view_behavior">

            <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="match_parent"
                android:layout_height="match_parent">

                <TextView
                    android:id="@+id/textView_dateTitleDetail"
                    style="@style/TextAppearance.MaterialComponents.Headline5"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginStart="@dimen/default_space"
                    android:layout_marginTop="@dimen/default_space"
                    android:ellipsize="end"
                    android:text="@string/movie_release_date"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toTopOf="parent" />

                <TextView
                    android:id="@+id/textView_dateDetail"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="@dimen/default_space"
                    android:text="@{movie.getDate()}"
                    android:textSize="@dimen/default_text_size"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="@id/textView_dateTitleDetail"
                    app:layout_constraintTop_toBottomOf="@id/textView_dateTitleDetail" />

                <TextView
                    android:id="@+id/textView_statusTitleDetail"
                    style="@style/TextAppearance.MaterialComponents.Headline5"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginStart="@dimen/default_space"
                    android:layout_marginTop="@dimen/default_space"
                    android:ellipsize="end"
                    android:text="@string/movie_status"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@id/textView_dateDetail" />

                <TextView
                    android:id="@+id/textView_statusDetail"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="@dimen/default_space"
                    android:text="@{movie.status}"
                    android:textSize="@dimen/default_text_size"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="@id/textView_statusTitleDetail"
                    app:layout_constraintTop_toBottomOf="@id/textView_statusTitleDetail" />

                <TextView
                    android:id="@+id/textView_overviewTitleDetail"
                    style="@style/TextAppearance.MaterialComponents.Headline5"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_marginStart="@dimen/default_space"
                    android:layout_marginTop="@dimen/default_space"
                    android:ellipsize="end"
                    android:text="@string/movie_overview"
                    app:layout_constraintStart_toStartOf="parent"
                    app:layout_constraintTop_toBottomOf="@id/textView_statusDetail" />

                <TextView
                    android:id="@+id/textView_overviewDetail"
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_marginEnd="@dimen/default_space"
                    android:text="@{movie.overview}"
                    android:textSize="@dimen/default_text_size"
                    app:layout_constraintEnd_toEndOf="parent"
                    app:layout_constraintStart_toStartOf="@id/textView_overviewTitleDetail"
                    app:layout_constraintTop_toBottomOf="@id/textView_overviewTitleDetail" />


            </androidx.constraintlayout.widget.ConstraintLayout>

        </androidx.core.widget.NestedScrollView>

        <ProgressBar
            android:id="@+id/progressBar_detail"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center" />

    </androidx.coordinatorlayout.widget.CoordinatorLayout>
```