package de.metalcon.middleware.view.entity.tab.preview;

import de.metalcon.middleware.view.entity.tab.EntityTabType;
import de.metalcon.middleware.view.entity.tab.preview.impl.AboutTabPreview;
import de.metalcon.middleware.view.entity.tab.preview.impl.BandsTabPreview;
import de.metalcon.middleware.view.entity.tab.preview.impl.EventsTabPreview;
import de.metalcon.middleware.view.entity.tab.preview.impl.NewsfeedTabPreview;
import de.metalcon.middleware.view.entity.tab.preview.impl.PhotosTabPreview;
import de.metalcon.middleware.view.entity.tab.preview.impl.RecommendationsTabPreview;
import de.metalcon.middleware.view.entity.tab.preview.impl.RecordsTabPreview;
import de.metalcon.middleware.view.entity.tab.preview.impl.ReviewsTabPreview;
import de.metalcon.middleware.view.entity.tab.preview.impl.TracksTabPreview;
import de.metalcon.middleware.view.entity.tab.preview.impl.UsersTabPreview;
import de.metalcon.middleware.view.entity.tab.preview.impl.VenuesTabPreview;

/**
 * Together with EntityTabPreviewConfig, this file is used to provide access to
 * prototype access to EntityTabPreviews inside singleton beans. See:
 * http://docs.spring.io/spring/docs/current/spring-framework-reference/html/
 * beans.html#beans-java-method-injection
 */
public abstract class EntityTabPreviewFactory {

    public EntityTabPreview createTabPreview(EntityTabType entityTabType) {
        switch (entityTabType) {
        // @formatter:off
            case ABOUT:           return createAboutTabPreview();
            case BANDS:           return createBandsTabPreview();
            case EVENTS:          return createEventsTabPreview();
            case NEWSFEED:        return createNewsfeedTabPreview();
            case PHOTOS:          return createPhotosTabPreview();
            case RECOMMENDATIONS: return createRecomendationsTabPreview();
            case RECORDS:         return createRecordsTabPreview();
            case REVIEWS:         return createReviewsTabPreview();
            case TRACKS:          return createTracksTabPreview();
            case USERS:           return createUsersTabPreview();
            case VENUES:          return createVenuesTabPreview();
            // @formatter:on

            default:
                throw new IllegalStateException("Unimplemented EntityTabType:"
                        + entityTabType.toString() + ".");
        }
    }

    /**
     * @return empty about tab preview
     */
    public abstract AboutTabPreview createAboutTabPreview();

    public abstract BandsTabPreview createBandsTabPreview();

    public abstract EventsTabPreview createEventsTabPreview();

    public abstract NewsfeedTabPreview createNewsfeedTabPreview();

    public abstract PhotosTabPreview createPhotosTabPreview();

    public abstract RecommendationsTabPreview createRecomendationsTabPreview();

    public abstract RecordsTabPreview createRecordsTabPreview();

    public abstract ReviewsTabPreview createReviewsTabPreview();

    public abstract TracksTabPreview createTracksTabPreview();

    public abstract UsersTabPreview createUsersTabPreview();

    public abstract VenuesTabPreview createVenuesTabPreview();

}
